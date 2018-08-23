/**
 * ProductoInternetViewModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ProductoInternetViewModel  implements java.io.Serializable {
    private java.lang.Integer codigo;

    private java.lang.String producto;

    private java.lang.Integer codigoEvento;

    private java.lang.String evento;

    private java.lang.String formula;

    public ProductoInternetViewModel() {
    }

    public ProductoInternetViewModel(
           java.lang.Integer codigo,
           java.lang.String producto,
           java.lang.Integer codigoEvento,
           java.lang.String evento,
           java.lang.String formula) {
           this.codigo = codigo;
           this.producto = producto;
           this.codigoEvento = codigoEvento;
           this.evento = evento;
           this.formula = formula;
    }


    /**
     * Gets the codigo value for this ProductoInternetViewModel.
     * 
     * @return codigo
     */
    public java.lang.Integer getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this ProductoInternetViewModel.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.Integer codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the producto value for this ProductoInternetViewModel.
     * 
     * @return producto
     */
    public java.lang.String getProducto() {
        return producto;
    }


    /**
     * Sets the producto value for this ProductoInternetViewModel.
     * 
     * @param producto
     */
    public void setProducto(java.lang.String producto) {
        this.producto = producto;
    }


    /**
     * Gets the codigoEvento value for this ProductoInternetViewModel.
     * 
     * @return codigoEvento
     */
    public java.lang.Integer getCodigoEvento() {
        return codigoEvento;
    }


    /**
     * Sets the codigoEvento value for this ProductoInternetViewModel.
     * 
     * @param codigoEvento
     */
    public void setCodigoEvento(java.lang.Integer codigoEvento) {
        this.codigoEvento = codigoEvento;
    }


    /**
     * Gets the evento value for this ProductoInternetViewModel.
     * 
     * @return evento
     */
    public java.lang.String getEvento() {
        return evento;
    }


    /**
     * Sets the evento value for this ProductoInternetViewModel.
     * 
     * @param evento
     */
    public void setEvento(java.lang.String evento) {
        this.evento = evento;
    }


    /**
     * Gets the formula value for this ProductoInternetViewModel.
     * 
     * @return formula
     */
    public java.lang.String getFormula() {
        return formula;
    }


    /**
     * Sets the formula value for this ProductoInternetViewModel.
     * 
     * @param formula
     */
    public void setFormula(java.lang.String formula) {
        this.formula = formula;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductoInternetViewModel)) return false;
        ProductoInternetViewModel other = (ProductoInternetViewModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.producto==null && other.getProducto()==null) || 
             (this.producto!=null &&
              this.producto.equals(other.getProducto()))) &&
            ((this.codigoEvento==null && other.getCodigoEvento()==null) || 
             (this.codigoEvento!=null &&
              this.codigoEvento.equals(other.getCodigoEvento()))) &&
            ((this.evento==null && other.getEvento()==null) || 
             (this.evento!=null &&
              this.evento.equals(other.getEvento()))) &&
            ((this.formula==null && other.getFormula()==null) || 
             (this.formula!=null &&
              this.formula.equals(other.getFormula())));
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
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getProducto() != null) {
            _hashCode += getProducto().hashCode();
        }
        if (getCodigoEvento() != null) {
            _hashCode += getCodigoEvento().hashCode();
        }
        if (getEvento() != null) {
            _hashCode += getEvento().hashCode();
        }
        if (getFormula() != null) {
            _hashCode += getFormula().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductoInternetViewModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ProductoInternetViewModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Producto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEvento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CodigoEvento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Evento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Formula"));
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
