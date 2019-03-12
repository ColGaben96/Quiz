package Modelo;

/**
 * @author Nicolas Ferreira; Gabriel Blanco La Rotta
 *
 */
public class Base
{
	int i,x,total,suma=0;
	int dv;
	private Archivo a;
	private Propiedades p;
	/**
	 * Método Constructor Base
	 */
	public Base()
	{
		// TODO Auto-generated constructor stub
		dv=0;
		x=suma;
		total=0;
		a = new Archivo();
	}
	/**
	 * Método tipo int GetDato
	 */
	public int getDato() 
	{
		while(x > 0)
		{
			total+=x % 10;
			x /= 10;
		}
		
		while(total>9)
		{
			x = total;
			total = 0;
			while(x > 0)
			{
				total +=x % 10;
				x /= 10;
			}
		}
		dv = total;
		System.out.println(dv);
		return dv;
	}
	/*
	 * Se crea el getter y setter de Archivo y Propiedades para luego ser invocado por Controlador 
	 */
	public Archivo getA() 
	{
		return a;
	}

	public void setA(Archivo a) 
	{
		this.a = a;
	}

	public Propiedades getP() 
	{
		return p;
	}

	public void setP(Propiedades p) 
	{
		this.p = p;
	}
}

