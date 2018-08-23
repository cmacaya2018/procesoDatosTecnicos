/**
 * Cliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Cliente  implements java.io.Serializable {
    private java.lang.String rut;

    private java.lang.String razonSocial;

    private java.lang.String numeroOT;

    private java.lang.String filial;

    private java.lang.String codigoFilialPrincipal;

    private java.lang.String codigoFilialSecundario;

    private java.lang.String servicio;

    private java.lang.String estado;

    public Cliente() {
    }

    public Cliente(
           java.lang.String rut,
           java.lang.String razonSocial,
           java.lang.String numeroOT,
           java.lang.String filial,
           java.lang.String codigoFilialPrincipal,
           java.lang.String codigoFilialSecundario,
           java.lang.String servicio,
           java.lang.String estado) {
           this.rut = rut;
           this.razonSocial = razonSocial;
           this.numeroOT = numeroOT;
           this.filial = filial;
           this.codigoFilialPrincipal = codigoFilialPrincipal;
           this.codigoFilialSecundario = codigoFilialSecundario;
           this.servicio = servicio;
           this.estado = estado;
    }


    /**
     * Gets the rut value for this Cliente.
     * 
     * @return rut
     */
    public java.lang.String getRut() {
        return rut;
    }


    /**
     * Sets the rut value for this Cliente.
     * 
     * @param rut
     */
    public void setRut(java.lang.String rut) {
        this.rut = rut;
    }


    /**
     * Gets the razonSocial value for this Cliente.
     * 
     * @return razonSocial
     */
    public java.lang.String getRazonSocial() {
        return razonSocial;
    }


    /**
     * Sets the razonSocial value for this Cliente.
     * 
     * @param razonSocial
     */
    public void setRazonSocial(java.lang.String razonSocial) {
        this.razonSocial = razonSocial;
    }


    /**
     * Gets the numeroOT value for this Cliente.
     * 
     * @return numeroOT
     */
    public java.lang.String getNumeroOT() {
        return numeroOT;
    }


    /**
     * Sets the numeroOT value for this Cliente.
     * 
     * @param numeroOT
     */
    public void setNumeroOT(java.lang.String numeroOT) {
        this.numeroOT = numeroOT;
    }


    /**
     * Gets the filial value for this Cliente.
     * 
     * @return filial
     */
    public java.lang.String getFilial() {
        return filial;
    }


    /**
     * Sets the filial value for this Cliente.
     * 
     * @param filial
     */
    public void setFilial(java.lang.String filial) {
        this.filial = filial;
    }


    /**
     * Gets the codigoFilialPrincipal value for this Cliente.
     * 
     * @return codigoFilialPrincipal
     */
    public java.lang.String getCodigoFilialPrincipal() {
        return codigoFilialPrincipal;
    }


    /**
     * Sets the codigoFilialPrincipal value for this Cliente.
     * 
     * @param codigoFilialPrincipal
     */
    public void setCodigoFilialPrincipal(java.lang.String codigoFilialPrincipal) {
        this.codigoFilialPrincipal = codigoFilialPrincipal;
    }


    /**
     * Gets the codigoFilialSecundario value for this Cliente.
     * 
     * @return codigoFilialSecundario
     */
    public java.lang.String getCodigoFilialSecundario() {
        return codigoFilialSecundario;
    }


    /**
     * Sets the codigoFilialSecundario value for this Cliente.
     * 
     * @param codigoFilialSecundario
     */
    public void setCodigoFilialSecundario(java.lang.String codigoFilialSecundario) {
        this.codigoFilialSecundario = codigoFilialSecundario;
    }


    /**
     * Gets the servicio value for this Cliente.
     * 
     * @return servicio
     */
    public java.lang.String getServicio() {
        return servicio;
    }


    /**
     * Sets the servicio value for this Cliente.
     * 
     * @param servicio
     */
    public void setServicio(java.lang.String servicio) {
        this.servicio = servicio;
    }


    /**
     * Gets the estado value for this Cliente.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Cliente.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cliente)) return false;
        Cliente other = (Cliente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rut==null && other.getRut()==null) || 
             (this.rut!=null &&
              this.rut.equals(other.getRut()))) &&
            ((this.razonSocial==null && other.getRazonSocial()==null) || 
             (this.razonSocial!=null &&
              this.razonSocial.equals(other.getRazonSocial()))) &&
            ((this.numeroOT==null && other.getNumeroOT()==null) || 
             (this.numeroOT!=null &&
              this.numeroOT.equals(other.getNumeroOT()))) &&
            ((this.filial==null && other.getFilial()==null) || 
             (this.filial!=null &&
              this.filial.equals(other.getFilial()))) &&
            ((this.codigoFilialPrincipal==null && other.getCodigoFilialPrincipal()==null) || 
             (this.codigoFilialPrincipal!=null &&
              this.codigoFilialPrincipal.equals(other.getCodigoFilialPrincipal()))) &&
            ((this.codigoFilialSecundario==null && other.getCodigoFilialSecundario()==null) || 
             (this.codigoFilialSecundario!=null &&
              this.codigoFilialSecundario.equals(other.getCodigoFilialSecundario()))) &&
            ((this.servicio==null && other.getServicio()==null) || 
             (this.servicio!=null &&
              this.servicio.equals(other.getServicio()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRut() != null) {
            _hashCode += getRut().hashCode();
        }
        if (getRazonSocial() != null) {
            _hashCode += getRazonSocial().hashCode();
        }
        if (getNumeroOT() != null) {
            _hashCode += getNumeroOT().hashCode();
        }
        if (getFilial() != null) {
            _hashCode += getFilial().hashCode();
        }
        if (getCodigoFilialPrincipal() != null) {
            _hashCode += getCodigoFilialPrincipal().hashCode();
        }
        if (getCodigoFilialSecundario() != null) {
            _hashCode += getCodigoFilialSecundario().hashCode();
        }
        if (getServicio() != null) {
            _hashCode += getServicio().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "cliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Rut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razonSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RazonSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroOT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NumeroOT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Filial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoFilialPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CodigoFilialPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoFilialSecundario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CodigoFilialSecundario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Servicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
