package boletin2java_parte1;

import java.util.Scanner;

public class Ejercicio3{
	
	public static void main (String args[]){
		
		int dni;
		int r;
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("Introduzca o seu DNI sen letra");
		dni=a.nextInt();
		
		r=dni%23;
		
		if(r==0)
			{System.out.println("A súa letra é T");}
		if(r==1)
			{System.out.println("A súa letra é R");}
		if(r==2)
			{System.out.println("A súa letra é W");}
		if(r==3)
			{System.out.println("A súa letra é A");}
		if(r==4)
			{System.out.println("A súa letra é G");}
		if(r==5)
			{System.out.println("A súa letra é M");}
		if(r==6)
			{System.out.println("A súa letra é Y");}
		if(r==7)
			{System.out.println("A súa letra é F");}
		if(r==8)
			{System.out.println("A súa letra é P");}
		if(r==9)
			{System.out.println("A súa letra é D");}
		if(r==10)
			{System.out.println("A súa letra é X");}
		if(r==11)
			{System.out.println("A súa letra é B");}
		if(r==12)
			{System.out.println("A súa letra é N");}
		if(r==13)
			{System.out.println("A súa letra é J");}
		if(r==14)
			{System.out.println("A súa letra é Z");}
		if(r==15)
			{System.out.println("A súa letra é S");}
		if(r==16)
			{System.out.println("A súa letra é Q");}
		if(r==17)
			{System.out.println("A súa letra é V");}
		if(r==18)
			{System.out.println("A súa letra é H");}
		if(r==19)
			{System.out.println("A súa letra é L");}
		if(r==20)
			{System.out.println("A súa letra é C");}
		if(r==21)
			{System.out.println("A súa letra é K");}
		if(r==22)
			{System.out.println("A súa letra é E");}
		

	
	}
}