package servicios;

public class ServicioCrearCursoProxy implements servicios.ServicioCrearCurso {
  private String _endpoint = null;
  private servicios.ServicioCrearCurso servicioCrearCurso = null;
  
  public ServicioCrearCursoProxy() {
    _initServicioCrearCursoProxy();
  }
  
  public ServicioCrearCursoProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicioCrearCursoProxy();
  }
  
  private void _initServicioCrearCursoProxy() {
    try {
      servicioCrearCurso = (new servicios.ServicioCrearCursoServiceLocator()).getServicioCrearCurso();
      if (servicioCrearCurso != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicioCrearCurso)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicioCrearCurso)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicioCrearCurso != null)
      ((javax.xml.rpc.Stub)servicioCrearCurso)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servicios.ServicioCrearCurso getServicioCrearCurso() {
    if (servicioCrearCurso == null)
      _initServicioCrearCursoProxy();
    return servicioCrearCurso;
  }
  
  public java.lang.String crearCurso(java.lang.String nombre, java.lang.String rutJefeAdm) throws java.rmi.RemoteException{
    if (servicioCrearCurso == null)
      _initServicioCrearCursoProxy();
    return servicioCrearCurso.crearCurso(nombre, rutJefeAdm);
  }
  
  public java.lang.String asignarProfesor(int id, java.lang.String nombreCurso, java.lang.String rutProfe, java.lang.String rutJefeAdm) throws java.rmi.RemoteException{
    if (servicioCrearCurso == null)
      _initServicioCrearCursoProxy();
    return servicioCrearCurso.asignarProfesor(id, nombreCurso, rutProfe, rutJefeAdm);
  }
  
  
}