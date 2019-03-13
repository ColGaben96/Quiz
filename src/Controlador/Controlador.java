package Controlador;

import Modelo.Base;
import Vista.Interfaz;
/**
 * @author Nicolas Ferreira; Gabriel Blanco La Rotta
 *
 */
public class Controlador 
{
	private Base bd;
	private Interfaz gui;
	/**
	 * Método Constructor de Controlador
	 */
	public Controlador()
	{
		bd=new Base();
		gui=new Interfaz();
		bd.Boton();
		gui.escribirDato(bd.getA().LeerArchivo());
		bd.getP().setPropiedades();
		
	}

}
