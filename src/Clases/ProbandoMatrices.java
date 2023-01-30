package Clases;

import java.util.Random;
import java.util.Scanner;

public class ProbandoMatrices {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[4][3];
		Scanner entrada = new Scanner(System.in);
		//{1,2,3},{4,5,6}
		
		
		for(int i=0; i<4; i++) {//filas
			for(int j=0; j<3; j++) {//columnas
				matriz[i][j] = aleatorio.nextInt(10) + 1;
			}
		}
		
		for(int i=0; i<4; i++) {//filas
			for(int j=0; j<3; j++) {//columnas
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		
		String[][] frutas = {
				{"limon", "kiwi", "naranja"},
				{"aguacate"},
				{"manzana", "pera", "platano", "melon"}
		}; 
		
		for(int i=0; i<frutas.length; i++) {
			for(int j=0; j<frutas[i].length; j++) {
				System.out.print(frutas[i][j] + " ");
			}
			System.out.println();
		}
		
		String[][] alumnos = new String[3][];
		alumnos[0] = new String[3];
		alumnos[1] = new String[2];
		alumnos[2] = new String[1];
		//{{1,2,3}, {1,2}, {1}}

		for(int i=0; i<alumnos.length; i++) {
			for(int j=0; j<alumnos[i].length; j++) {
				System.out.println("Ingrese el nombre de un alumno del grupo "+(i+1));
				alumnos[i][j] = entrada.next();
			}
		}
		
		
		for(int i=0; i<alumnos.length; i++) {
			for(int j=0; j<alumnos[i].length; j++) {
				System.out.print("[" + i + "][" + j + "] = " + alumnos[i][j] + " ");
			}
			System.out.println();
		}
	}
}
