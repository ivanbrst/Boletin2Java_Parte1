package boletin2java_parte1;

import java.util.Scanner;

public class Ejercicio5{
	
	public static void main (String args[]){
		
		
		int ano;
		int bisiesto;
		
		bisiesto=0;
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("Introduzca o ano");
		ano=a.nextInt();
		
		if((ano%4==0) && (ano%100!=0) | (ano%400==0))
			{bisiesto=1;}
		
		if(bisiesto==1)
		{System.out.println("O ano introducido é bisiesto");}
		else{System.out.println("O ano introducido non é bisiesto");}
		

		
		
		
		
		
		
		
		
	}
}