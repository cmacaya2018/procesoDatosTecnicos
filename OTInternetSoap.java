/**
 * OTInternetSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface OTInternetSoap extends java.rmi.Remote {
    public org.tempuri.ProductoInternetViewModel[] getProductoInternet(java.lang.String nombreProducto, java.lang.String codigoProducto) throws java.rmi.RemoteException;
    public org.tempuri.Cliente[] getOTListadoCliente(java.lang.String rutFactura) throws java.rmi.RemoteException;
    public java.lang.String obtenerListadoPorOT(java.lang.String numeroOrdenTrabajo) throws java.rmi.RemoteException;
}
