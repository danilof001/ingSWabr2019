package primos;

import java.io.*;
import java.util.Scanner;

public class PrimosEntreRangos 
{
	//Hallar números primos con un rango inicial y final.
	 public static void main(String arg[]) throws IOException
	 {
		 String ruta = "ResultadosNmerosPrimos.txt";
		 File archivo = new File(ruta);
		 BufferedWriter bw;
		 int i,j;
		 boolean esPrimo;
		 int rInicial=2;//Rango inicial, este debe ser mayor de 1.
		 int rFinal = 500;//Rango final.
		 String resultados = "";
		 
	     System.out.println ("PROGRAMA PARA CALCULAR UNA SERIE DE NÚMEROS PRIMOS DENTRO DE UN RANGO");
	     System.out.print ("Por favor introduzca el valor inicial:");
	     Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
	     rInicial = entradaEscaner.nextInt (); //Invocamos un método sobre un objeto Scanner
	     System.out.print ("Por favor introduzca el valor final:");
	     rFinal = entradaEscaner.nextInt (); //Invocamos un método sobre un objeto Scanner

		 for(i = rInicial;i <= rFinal;i++)
		  {
			  //recorro ciclo tantas veces como necesite(<= es para incluir el valor de rFinal).
		      	esPrimo=true;// i es primo hasta que se demuestre lo contrario, jejejejeje.
		      	for(j = 2;j < i;j++)
		      	{
		      		//no coloque j = 1 porque ya sabemos que todo numero es divisible por 1.
		      		/*j < i es para no incluir el numero a evaluar, pues todo numero es divisible
		       		por si mismo.*/
		      		if(i % j == 0)
		      		{//Si además del 1 y el mismo hay otro divisor, ya no es primo.
		      			//% devuelve el residuo de i/j
		      			esPrimo = false;//se demostró que i no es primo.
		      		}
		      	}
		       if(esPrimo)
		       {//Si es primo lo imprimo.
		    	   resultados = resultados + i + " ";
		    	   resultados = resultados + '\n';
		    	   
		       }
		  }
		    
		 System.out.print(resultados+" ");
		 //Escribimos la data en el archivo
		 bw = new BufferedWriter(new FileWriter(archivo));
		 bw.write("ARCHIVO DE RESULTADOS ");		 
		 bw.newLine();
		 bw.write("UTPL - INGENIERÍA DE SOFTWARE - 2B");		 
		 bw.newLine();
		 bw.write("Carlos Danilo Freire Castañeda ");		 
		 bw.newLine();
		 bw.newLine();
		 bw.write("LISTADO DE NUMEROS PRIMOS ENTRE " + rInicial + " y " + rFinal);
		 bw.newLine();
		 bw.write("_________________________________________________________________ ");		 
		 bw.newLine();
		 bw.write(resultados);
		 bw.close();	    	   

	 }
}
	
