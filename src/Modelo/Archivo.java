package Modelo;

import java.io.*;

/**
 * @author Nicolas Ferreira
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
	public Archivo()
	{
		
	}
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
	public void EscribirArchivo(String linea)
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
