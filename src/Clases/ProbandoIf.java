package Clases;

import java.util.Scanner;

public class ProbandoIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingresa un entero");

		int n = entrada.nextInt();

		// Indicar si es mayor de 100
		// Si es que es cierto se ejecuta el código
		if (n >= 100) {
			System.out.println("Mayor o igual a 100");
		} else if (n >= 80) {
			System.out.println("Entre 80 y 99");
		} else if (n >= 50) {
			System.out.println("Entre 50 y 79");
		} else {
			System.out.println("Menor de 50");
		}
	}
}
