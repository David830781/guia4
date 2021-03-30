package com.senati.eti;
import java.util.Scanner;
//Defino el import escaner para leer los datos ingresados
public class Caso5prct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         //Defino una variable para el escaner
		 
		 //Creo los respectivos arrays limitando a 5 todas
		 String[] arrcodigo = new String[5];
         arrcodigo[0]= "A-111";
         arrcodigo[1]= "A-122";
         arrcodigo[2]= "A-133";
         arrcodigo[3]= "A-144";
         arrcodigo[4]= "A-155";
         
         String[] arrnombre = new String[5];
         arrnombre [0]= "Jhonny Jarama";
         arrnombre [1]= "Alisson Portilla";
         arrnombre [2]= "Piero Saenz";
         arrnombre [3]= "David Yarleque";
         arrnombre [4]= "Cristian De la Cruz";
         
         Integer[] arrnotas = new Integer[5];
         arrnotas[0] = 15;
         arrnotas[1] = 20;
         arrnotas[2] = 07;
         arrnotas[3] = 16;
         arrnotas[4] = 01;
         
         
         //Solicitamos el codigo del estudiante lo defino como texto y lo llamo codigo
         System.out.print("Ingrese código del estudiante: ");
         String codigo = sc.nextLine();
         //Creo un numero improbable para que cuando ejecute al escojer ese mande error
         int fall = -1; 
         
         //Creamos un para y definimos la variable i que es el numero de vueltas
         for (int i = 0; i < arrcodigo.length; i++){
        	if(codigo.equals(arrcodigo[i])) {//usamos equals para comparar si los 2 son iguales
				fall = i;//igualamos fall y la variable i para representar los valores de los arrays iniciales
				break;//Usamos break para que nos mande solo el asolicitado
			}
            	
         }  
         //Colocamos las condiciones empezando por la que no se cumple  
         if (fall ==-1) {
            System.out.println("\n--------------------------");
            System.out.println("Registro no encontrado");
            System.out.println("--------------------------");
                
         }
         else{
            System.out.println("\nRegistro encontrado");
            System.out.println("\n--------------------------");
            System.out.println("Código del alumno: "+ arrcodigo[fall]);
            System.out.println("Nombre del alumno: "+ arrnombre[fall]);
            System.out.println("Nota del alumno   : "+ arrnotas[fall]);
         
         }
         
	}
    
}
	

