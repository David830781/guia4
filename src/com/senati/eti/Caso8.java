package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;



public class Caso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);

	        ArrayList<String> arrNombre = new ArrayList<String>();
	        ArrayList<Integer> arrEdad = new ArrayList<Integer>();

	        String rp = "S", nombre = "";
	        int num_reg = 0, edad = 0;
	        
	        while (rp.equals("S") || rp.equals("s")) {
	            num_reg++;
	            
	            System.out.println("\n----------");
	            System.out.println("REGISTRO " + num_reg);
	            System.out.println("----------");
	            
	            System.out.print("\nNombre: ");
	            nombre = sc.nextLine();
	            
	            System.out.print("Edad: ");
	            edad = sc.nextInt();
	            
	            arrNombre.add(nombre);
	            arrEdad.add(edad);

	            sc.nextLine();
	             
	            rp = "";

	            while (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
	                System.out.print("\n¿Continuar con tro registro <S/N>?: ");
	                rp = sc.nextLine();

	                if (!rp.equals("S") && !rp.equals("s") && !rp.equals("N") && !rp.equals("n")) {
	                    System.out.println("\nSolo escriba S o N");
	                }

	            }

	        }
             //Impresion de datos ingresados
	        System.out.println("LISTA DE DATOS INGRESADOS");
	        System.out.println("--------------------------");
	        
	        System.out.println("Nombre\tEdad \t\tEstado");
	        System.out.println("******************************");
	        
	        for (int i =0; i < arrNombre.size(); i++)
	        	System.out.println(arrNombre.get(i) + "\t\t" +
	                                arrEdad.get(i) + "años\t\t" +
	        			            VerEstado(arrEdad.get(i)));
	
	}
	      public static String VerEstado(int edad) {
	        	  String estado = "Menor de edad";
	        	  
	        	if(edad >= 18) estado ="Mayor de edad";
	        	  
	        	return estado;
	          }
	      public static String VerMensaje(int edad) {
	    	  //Hasta 10 = Niñez
	    	  //Hasta 17 = Adolecencia
	    	  //Hasta 24 = Juventud
	    	  //Hasta 59 = Adulto
	    	  //De 60 a mas = Adulto mayor
	    	  return "";
	      }
	      
	}
