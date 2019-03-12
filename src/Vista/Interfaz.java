package Vista;

import javax.swing.JOptionPane;

/**
 * @author Gabriel Blanco La Rotta
 *
 */
public class Interfaz 
{

	public Interfaz() 
	{
		// TODO Auto-generated constructor stub
		
	}

	/* metodo de prueba que pide un dato por JOptionPane y retorna el String correspondiente
	 * Reemplazar por lo que se necesiten
	 */
	public String pedirDato()
	{
		return (JOptionPane.showInputDialog(null, "Ingrese la clave", "Clave", JOptionPane.OK_CANCEL_OPTION));
	}
	
	/* metodo de prueba que imprime un dato procesado por un m�todo declarado en 
	 * Reemplazar por lo que se necesiten
	 */

	public void escribirDato(String dato) 
	{
		
		JOptionPane.showMessageDialog(null, dato, "Informacion", JOptionPane.INFORMATION_MESSAGE);
	}
}
