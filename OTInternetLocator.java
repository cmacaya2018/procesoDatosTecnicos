/**
 * OTInternetLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class OTInternetLocator extends org.apache.axis.client.Service implements org.tempuri.OTInternet {

    public OTInternetLocator() {
    }


    public OTInternetLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OTInternetLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OTInternetSoap
    private java.lang.String OTInternetSoap_address = "http://integracion.gtdinternet.com/soap/otinternet.asmx";

    public java.lang.String getOTInternetSoapAddress() {
        return OTInternetSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OTInternetSoapWSDDServiceName = "OTInternetSoap";

    public java.lang.String getOTInternetSoapWSDDServiceName() {
        return OTInternetSoapWSDDServiceName;
    }

    public void setOTInternetSoapWSDDServiceName(java.lang.String name) {
        OTInternetSoapWSDDServiceName = name;
    }

    public org.tempuri.OTInternetSoap getOTInternetSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OTInternetSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOTInternetSoap(endpoint);
    }

    public org.tempuri.OTInternetSoap getOTInternetSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.OTInternetSoapStub _stub = new org.tempuri.OTInternetSoapStub(portAddress, this);
            _stub.setPortName(getOTInternetSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOTInternetSoapEndpointAddress(java.lang.String address) {
        OTInternetSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.OTInternetSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.OTInternetSoapStub _stub = new org.tempuri.OTInternetSoapStub(new java.net.URL(OTInternetSoap_address), this);
                _stub.setPortName(getOTInternetSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("OTInternetSoap".equals(inputPortName)) {
            return getOTInternetSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "OTInternet");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "OTInternetSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OTInternetSoap".equals(portName)) {
            setOTInternetSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
