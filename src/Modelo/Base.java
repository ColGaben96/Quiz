package Modelo;

/**
 * @author Nicolás Ferreira
 *
 */
public class Base
{
	int i,x,total;
	int dv=0;{
	
	int suma = 0;
	x=suma;
	total=0;
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
	dv=total;
	System.out.println(dv);
}
}
