/**
 * ServicioCrearCurso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicios;

public interface ServicioCrearCurso extends java.rmi.Remote {
    public java.lang.String crearCurso(java.lang.String nombre, java.lang.String rutJefeAdm) throws java.rmi.RemoteException;
    public java.lang.String asignarProfesor(int id, java.lang.String nombreCurso, java.lang.String rutProfe, java.lang.String rutJefeAdm) throws java.rmi.RemoteException;
}
