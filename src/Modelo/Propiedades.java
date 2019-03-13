package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Nicolas Ferreira; Gabriel Blanco La Rotta
 *
 */
public class Propiedades 
{
	Properties prop = new Properties();
	String arcpropiedades = "./docs/validaciones.properties";
	
	/**
	 * Método Setter para Propiedades
	 */
	public void setPropiedades()
	{
		try 
		{
			prop.setProperty("nombreArchivo", "./docs/clavemasdigito.txt");
			prop.setProperty("archivoProp", "./docs/validaciones.properties");
			prop.setProperty("nombreCodigo", "Archivo.java");
			prop.store(new FileOutputStream(arcpropiedades), null);
		} 
		catch (IOException ex) 
		{
			// TODO: handle exception
			ex.printStackTrace();
		}
	}
	
	/**
	 * Método Getter para Propiedades
	 */
	public void getPropiedades()
	{
		try 
		{
			prop.load(new FileInputStream(arcpropiedades));
			prop.list(System.out);
			System.out.println(prop.getProperty("nombreArchivo"));
			System.out.println(prop.getProperty("archivoProp"));
			System.out.println(prop.getProperty("nombreCodigo"));
		} 
		catch (IOException ex) 
		{
			// TODO: handle exception
			ex.printStackTrace();
		}
	}
}
