package br.senai.sp.jandira;

import java.util.Scanner;

public class Lacos {

	public static void main(String[] args) {
	
		int valor = 1;
		int fibonacci = valor * (valor -1);
		
		
		while (valor  > 2) {
			valor--;
			fibonacci = fibonacci * (valor - 1);
			System.out.println(fibonacci);
		

			
		}
		System.out.println(fibonacci);
		
	
		
		Scanner leitor = new Scanner (System.in);
		String resposta = "s";
		
		
		

	}

}
