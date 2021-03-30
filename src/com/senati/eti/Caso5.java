package com.senati.eti;
import java.util.Scanner;
public class Caso5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arrCodigo= {"A-123","A-456","A-789","A-777"};
		String[] arrNombre= {"Joe Castillo","Rosa flores","Ricardo montes","David Yarleque"};
		int[] arrNota = {15,8,17,11};
		
		System.out.println("Busqueda de datos");
		System.out.println("-----------------");
		System.out.println("Codigo a buscar: ");
		String codigo = sc.nextLine(); //A-784
		
		int pos = -1;
		
		for (int x = 0; x < arrCodigo.length; x++) {
			if (codigo.equals(arrCodigo[x])) {
				pos = x;
				break;
			}
		}
		
		if(pos==-1) {
			System.out.println("Busqueda de datos");
			System.out.println("Codigo no existente");
		}
		else {
			System.out.println("Busqueda de datos");
			System.out.println("Codigo encontrado");
			System.out.println("\nCodigo: " + arrCodigo[pos]);
			System.out.println("Nombre: " + arrNombre[pos] );
			System.out.println("Nota: " + arrNota[pos]);
		}
		
		
		
	}

}
