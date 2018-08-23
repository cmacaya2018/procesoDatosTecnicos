package org.tempuri;

public class OTInternetSoapProxy implements org.tempuri.OTInternetSoap {
  private String _endpoint = null;
  private org.tempuri.OTInternetSoap oTInternetSoap = null;
  
  public OTInternetSoapProxy() {
    _initOTInternetSoapProxy();
  }
  
  public OTInternetSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initOTInternetSoapProxy();
  }
  
  private void _initOTInternetSoapProxy() {
    try {
      oTInternetSoap = (new org.tempuri.OTInternetLocator()).getOTInternetSoap();
      if (oTInternetSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)oTInternetSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)oTInternetSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (oTInternetSoap != null)
      ((javax.xml.rpc.Stub)oTInternetSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.OTInternetSoap getOTInternetSoap() {
    if (oTInternetSoap == null)
      _initOTInternetSoapProxy();
    return oTInternetSoap;
  }
  
  public org.tempuri.ProductoInternetViewModel[] getProductoInternet(java.lang.String nombreProducto, java.lang.String codigoProducto) throws java.rmi.RemoteException{
    if (oTInternetSoap == null)
      _initOTInternetSoapProxy();
    return oTInternetSoap.getProductoInternet(nombreProducto, codigoProducto);
  }
  
  public org.tempuri.Cliente[] getOTListadoCliente(java.lang.String rutFactura) throws java.rmi.RemoteException{
    if (oTInternetSoap == null)
      _initOTInternetSoapProxy();
    return oTInternetSoap.getOTListadoCliente(rutFactura);
  }
  
  public java.lang.String obtenerListadoPorOT(java.lang.String numeroOrdenTrabajo) throws java.rmi.RemoteException{
    if (oTInternetSoap == null)
      _initOTInternetSoapProxy();
    return oTInternetSoap.obtenerListadoPorOT(numeroOrdenTrabajo);
  }
  
  
}