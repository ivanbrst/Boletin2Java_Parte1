package boletin2java_parte1;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String args[]){
		
		double valor;
		double precio;
		
		precio=0;
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("Introduzca o valor do producto con coma para os céntimos");
		valor=a.nextDouble();
		
		if(valor<=200)
			{precio=valor;}
        if((valor>200) && (valor<=1000))
			{precio=valor*0.95;}
        if(valor>1000)
			{precio=valor*0.90;}  
		
        System.out.println("O precio final é de "+precio+"");
		
		
		
		
		
	}
}
