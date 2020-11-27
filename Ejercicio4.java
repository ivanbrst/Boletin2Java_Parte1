package boletin2java_parte1;

import java.util.Scanner;

public class Ejercicio4{
	
	public static void main (String args[]){
		
		int n;
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Introduzca un número del 1 al 7");
		n=a.nextInt();
		
		
		
		switch(n){
		
			case 1:{System.out.println("O día elexido é o Luns");
						break;
						}
						
			case 2:{System.out.println("O día elexido é o Martes");
						break;
						}
						
			case 3:{System.out.println("O día elexido é o Mércores");
						break;
						}
						
			case 4:{System.out.println("O día elexido é o Xoves");
						break;
						}
						
			case 5:{System.out.println("O día elexido é o Venres");
						break;
						}
			case 6:{System.out.println("O día elexido é o Sábado");
						break;
						}
			case 7:{System.out.println("O día elexido é o Domingo");
						break;
						}
			default:{System.out.println("Error");
						break;
						}
	
		}
	}
	
}

		
		
