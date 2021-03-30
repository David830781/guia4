package com.senati.eti;


import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Definimos una varible para el scanner
		Scanner sc = new Scanner(System.in);
		Integer[] numeros = new Integer[5];
		int prs=0,inp=0,total=0;
		float prom=0;
		for(int x =0; x <= numeros.length - 1; x++){
		    System.out.println("Ingrese numero " + (x + 1) + ": ");
		    numeros[x] = sc.nextInt();
		    
		if(x % 2 == 0) {
			prs +=1;
		}
		else 
			inp +=1;
		
		total += numeros[x];
		}
		
		prom=total/5f;
		
		System.out.println("-------------------");
		System.out.println("Resultados");
		System.out.println("-------------------");
		System.out.println("Cantidad de numeros pares: " + prs);
		System.out.println("Cantidad de numeros impares: " + inp);
		System.out.println("Promedio: " + prom);
	}

}
