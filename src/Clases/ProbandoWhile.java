package Clases;

import java.util.Scanner;

public class ProbandoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroDeCalificaciones;
		int i = 1;
		int calificacionTemporal;
		float suma = 0;
		float promedio;
		
		System.out.println("Ingrese el número de calificaciones");
		numeroDeCalificaciones = entrada.nextInt();
	
		while(i <= numeroDeCalificaciones) {
			System.out.println("Ingresa la calificacion " + i);
			calificacionTemporal = entrada.nextInt();
			suma += calificacionTemporal;
			i++;
		}
		promedio = suma / numeroDeCalificaciones;
		System.out.println("El promedio es: " + promedio);
	}
	
}
