/**
 * ServicioCrearCursoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicios;

public class ServicioCrearCursoServiceLocator extends org.apache.axis.client.Service implements servicios.ServicioCrearCursoService {

    public ServicioCrearCursoServiceLocator() {
    }


    public ServicioCrearCursoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicioCrearCursoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServicioCrearCurso
    private java.lang.String ServicioCrearCurso_address = "http://localhost:8080/ServicioUniver/services/ServicioCrearCurso";

    public java.lang.String getServicioCrearCursoAddress() {
        return ServicioCrearCurso_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicioCrearCursoWSDDServiceName = "ServicioCrearCurso";

    public java.lang.String getServicioCrearCursoWSDDServiceName() {
        return ServicioCrearCursoWSDDServiceName;
    }

    public void setServicioCrearCursoWSDDServiceName(java.lang.String name) {
        ServicioCrearCursoWSDDServiceName = name;
    }

    public servicios.ServicioCrearCurso getServicioCrearCurso() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServicioCrearCurso_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServicioCrearCurso(endpoint);
    }

    public servicios.ServicioCrearCurso getServicioCrearCurso(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            servicios.ServicioCrearCursoSoapBindingStub _stub = new servicios.ServicioCrearCursoSoapBindingStub(portAddress, this);
            _stub.setPortName(getServicioCrearCursoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicioCrearCursoEndpointAddress(java.lang.String address) {
        ServicioCrearCurso_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (servicios.ServicioCrearCurso.class.isAssignableFrom(serviceEndpointInterface)) {
                servicios.ServicioCrearCursoSoapBindingStub _stub = new servicios.ServicioCrearCursoSoapBindingStub(new java.net.URL(ServicioCrearCurso_address), this);
                _stub.setPortName(getServicioCrearCursoWSDDServiceName());
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
        if ("ServicioCrearCurso".equals(inputPortName)) {
            return getServicioCrearCurso();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicios", "ServicioCrearCursoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicios", "ServicioCrearCurso"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServicioCrearCurso".equals(portName)) {
            setServicioCrearCursoEndpointAddress(address);
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
