package datosTecnicos;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.tempuri.OTInternetSoap;
import org.tempuri.OTInternetSoapProxy;

import datosTecnicos.dto.ServicioInternetDTO;


public class datosTecnicos {
	
	public static void main(String argv[]) {
		
		System.out.println("Inicio del proceso");
	
		try {
			
			Connection conn = abreConexion("teleductos");

			//Se obtienen todos los servicios.
			List <ServicioInternetDTO> lServicios = obtieneListaServiciosOT(conn);
			
			conn.close();
			conn = null;
			
			for (ServicioInternetDTO servicio : lServicios) {				
				String html = getOTInternetLista(servicio.getNumeroOT());
				servicio.setHtml(html);
			}
			
			conn = abreConexion("teleductos");

			for (ServicioInternetDTO servicio : lServicios) {				
				updateDatosTecnicos(servicio, conn);				
				conn.commit();
			}
			
			conn.close();
			conn = null;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fin del proceso");		
	}

	/**
	 * Llamada al WS WSOTInternetLista
	 * 
	 * @param numeroOT
	 * 
	 * @return String
	 * 
	 * @throws DAOException
	 */
	public static String getOTInternetLista(String numeroOT) {
		
		System.out.println("[INFO] Entro a DelegateWS.getOTInternetLista");
		
		String url = "http://integracion.gtdinternet.com/soap/otinternet.asmx";
		System.out.println("[INFO] URL WEBSERVICE:"+url);
		
		OTInternetSoapProxy proxy = new OTInternetSoapProxy(url);
		OTInternetSoap serv = proxy.getOTInternetSoap();
		
		String salida = "";
		
		try {

			System.out.println("****** PARSystem.out.println(*******");
			System.out.println("numeroOT : " + numeroOT);
			
			salida = serv.obtenerListadoPorOT(numeroOT);
			
			System.out.println("Salida : " + salida);
			
		} catch (RemoteException e) {
			System.out.println("[ERROR] Problemas en el WS, " + e.getMessage());
		}
		
		return salida;
	}
	
	private static List<ServicioInternetDTO> obtieneListaServiciosOT(Connection conn) {
		
		List <ServicioInternetDTO> lServicios = new ArrayList<ServicioInternetDTO>();
		
		try {
			String sql = "select cod_servicio, ot from teleductos.datosinternet";  

			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
	
			while (rs.next()) {
				
				ServicioInternetDTO servicio = new ServicioInternetDTO();
				
				servicio.setCodServicio(rs.getString("COD_SERVICIO"));
				servicio.setNumeroOT(rs.getString("OT"));
				
				lServicios.add(servicio);				
			}
			
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return lServicios;
	}
	
	private static Connection abreConexion(String usuario) {
		
		Connection conn = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			  conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.7:1531/expgtd.grupogtd.com", usuario,"kronner");// PRoduccion
			  //conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.10:1531/expgtd.grupogtd.com", usuario,"massu");
	
			  conn.setAutoCommit(false);
			
		}  catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		return conn;
	}
	
	private static void updateDatosTecnicos(ServicioInternetDTO servicio, Connection conn) {
		
		System.out.println("updateDatosTecnicos");
		
		try {
			
		String sql = "UPDATE teleductos.datosinternet " +  
					"SET datosot = ?, digitador = 'SISTEMA', fecha_digitacion = sysdate " + 
					"WHERE cod_servicio = ? and ot = ?";

			PreparedStatement stmt = conn.prepareStatement(sql);

			stmt.setString(1, servicio.getHtml());
			stmt.setString(2, servicio.getCodServicio());
			stmt.setString(3, servicio.getNumeroOT());

			stmt.executeUpdate();
			
			stmt.close();
			stmt = null;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
