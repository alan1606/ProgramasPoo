package Clases;

import java.util.Scanner;

public class ProbandoArreglos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el número de frutas");
		int veces = entrada.nextInt();
		String[] frutas = new String[veces];
		
		//frutas = {manzana, pera, mango} 3 
		// frutas[2]
		
		for(int i=0; i<veces; i++) {
			System.out.println("Ingrese una fruta ");
			String fruta = entrada.next();
			frutas[i] = fruta;
		}
		
		System.out.println("Recorriendo el arreglo al revés");
		for(int i=veces-1; i>=0; i--) {
			System.out.println(frutas[i]);
		}
	

	}
}
