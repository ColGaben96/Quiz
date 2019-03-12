package Controlador;

import java.util.Scanner;

public class gsrd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b= ("1212121212");
		String[] matriz = (a+"").split("");
		String[] mt = (b+"").split("");
		int f = 0;
		for (int i = 0; i < mt.length; i++) {
			f += (Integer.parseInt(matriz[i])*Integer.parseInt(mt[i]));
		}
		System.out.println(f);
	}
}
