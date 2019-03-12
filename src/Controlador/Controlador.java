package Controlador;

import Modelo.Base;
import Vista.Interfaz;
/**
 * @author Nicolas Ferreira
 *
 */
public class Controlador 
{
	private Base bd;
	private Interfaz gui;
	
	public Controlador()
	{
		bd=new Base();
		gui=new Interfaz();
		bd.getA().EscribirArchivo(bd.getDato());
		gui.escribirDato(bd.getA().LeerArchivo());
	}

}
