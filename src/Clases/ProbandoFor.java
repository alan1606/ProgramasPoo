package Clases;

import java.util.Scanner;

public class ProbandoFor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroDeCalificaciones;
		int calificacionTemporal;
		float suma = 0;
		float promedio;
		
		System.out.println("Ingrese el número de calificaciones");
		numeroDeCalificaciones = entrada.nextInt();
		
		for (int i = 0; i < numeroDeCalificaciones; i++) {
			System.out.println("Ingresa la calificacion " + (i+1));
			calificacionTemporal = entrada.nextInt();
			suma += calificacionTemporal;
		}
		
		promedio = suma / numeroDeCalificaciones;
		System.out.println("El promedio es: " + promedio);
	}
}
