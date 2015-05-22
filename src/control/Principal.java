package control;

import java.rmi.RemoteException;

import servicios.ServicioCrearCursoProxy;
import servicios.ServicioMatriculaProxy;
/**
 * 
 * @author Alfredo
 *
 */
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//se crea una instancia de los servicios a consumir
		ServicioCrearCursoProxy a = new ServicioCrearCursoProxy();
		ServicioMatriculaProxy b = new ServicioMatriculaProxy();
		
		try {
			/*
			 * se le asigna a un string la llamada a los métodos 
			 */
			//String msj1 = a.crearCurso("Hardware", "115749802");
			//String msj2 = a.asignarProfesor(5, "Discretas", "132457684", "115749802");
			String msj3 = b.mostrarMorososMatricula();
			
			/*
			 * se muestran por consola los resultados retornados
			 */
			//System.out.println(msj1);
			//System.out.println(msj2);
			System.out.println(msj3);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
