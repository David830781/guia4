package com.senati.eti;

public class Caso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Declarar arreglo
		String[] nombre = new String[4];
        //Asignar valores
        nombre[0] ="Joe castillo";
        nombre[1] ="Rosa flores";
        nombre[2] ="Carlos Tello";
        nombre[3] ="Ericka Valiente";
        
        for (int x = 0; x < nombre.length; x++)
        	System.out.println("Nombre " + (x+1) + ": " + nombre[x]);
        
	}

}
