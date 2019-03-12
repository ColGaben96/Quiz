package Modelo;

import java.io.*;

/**
 * @author Nicolas Ferreira; Gabriel Blanco La Rotta
 *
 */
public class Archivo 
{
	private File f;
	private FileReader fr;
	private BufferedReader br;
	private FileWriter fw;
	private PrintWriter pw;
	private String line;
	/**
	 * Método constuctor para Archivo
	 */
	public Archivo()
	{
		
	}
	/**
	 * Método tipo String LeerArchivo
	 * @return
	 */
	public String LeerArchivo()
	{
		String str = "";
		f = new File("./docs/clavemasdigito.txt");
		try
		{
			fr= new FileReader(f);
			br= new BufferedReader(fr);
			line= br.readLine();
			while(line != null)
			{
				str += line+"\n";
				line = br.readLine();
			}
			fr.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return str;
	}
	/**
	 * Método tipo void EscribirArchivo
	 * @param linea
	 */
	public void EscribirArchivo(int linea)
	{
		f = new File("./docs/clavemasdigito.txt");
		try
		{
			fw= new FileWriter(f);
			pw= new PrintWriter(fw);
			for (int i=0; i<1; i++)
			{
				pw.println(linea);
			}
			fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
