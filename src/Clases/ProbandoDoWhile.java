package Clases;

import java.util.Scanner;

public class ProbandoDoWhile {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int opcion = 0;

		do {
			mostrarMenu();
			opcion = e.nextInt();
			evaluarOpcion(opcion);
			System.out.println("\n\n\n");
		} while (opcion != 0);
		System.out.println("Gracias por usar el programa");
	}

	private static void mostrarMenu() {
		System.out.println("Ingrese una opción:" + "\n1: Imprimir saldo" + "\n2: Hacer una recarga"
				+ "\n3: Ver el buzon" + "\n0: Salir");
	}

	private static void evaluarOpcion(int opcion) {
		switch(opcion) {
			case 1: 
					System.out.println("Imprimiendo saldo");
				break; 
			case 2: 
				System.out.println("Haciendo recarga");
				break; 
			case 3: 
				System.out.println("Viendo buzon");
				break; 
			default: break; 
		}
	}
}
