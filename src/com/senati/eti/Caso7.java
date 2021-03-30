package com.senati.eti;


import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		// Creamos la instancia sc para crear el objeto Scanner
				Scanner sc = new Scanner(System.in);
				//Declaramos la matriz 
				int [][]  numero = new int[3][4];
				System.out.println("Lectura de números");
				System.out.println("----------------------");
				
				for ( int f = 0; f < numero.length; f++ ) {
					System.out.println("Datos de la fila: " + (f+1));
					System.out.println("----------------------");
					
					for ( int c = 0; c < numero [0].length; c++) {
						System.out.print("Número " + (c + 1)+ ": ");
					     numero [f] [c] = sc.nextInt();
					}
					System.out.println();
				}
				
				
				

	}

}