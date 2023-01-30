package Clases;

import java.util.Scanner;

public class ProbandoSwitch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un entero");
		
		int entero = entrada.nextInt();
		
		/*
		 * 1. Muestre hola
		 * 2. Muestre adios
		 * 3. Muestre alumnos
		 * 4. Muestre java
		 * 5. Muestre c++
		 * 6. Muestre python
		 * 7. Muestre mandarina
		 * */
		switch(entero) {
			case 1: 
				imprimir("Hola"); 
				break;
			case 2: 
				imprimir("Adios");
				break;
			case 3: 
				imprimir("Alumnos");
				break;
			case 4: 
				imprimir("Java");
				break;
			case 5: 
				imprimir("C++");
				break;
			case 6: 
				imprimir("Python");
				break;
			case 7: 
				imprimir("Mandarina");
				break;
			default: 
				imprimir("Opción no encontrada");
				break;
		}
	}

	private static void imprimir(String string) {
		System.out.println(string);
	}
}
