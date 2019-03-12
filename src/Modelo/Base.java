package Modelo;

/**
 * @author Nicolas Ferreira
 *
 */
public class Base
{
	int i,x,total,suma=0;
	String dv;
	private Archivo a;
	
	public Base()
	{
		// TODO Auto-generated constructor stub
		dv="";
		//BD = new Persistencia();
		x=suma;
		total=0;
		a = new Archivo();
	}

	//getter para el atributo ejemplo
	

	//setter para el atributo ejemplo
	public String getDato() 
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
		System.out.println(dv);
		return dv;
	}

	public Archivo getA() {
		return a;
	}

	public void setA(Archivo a) {
		this.a = a;
	}
}

