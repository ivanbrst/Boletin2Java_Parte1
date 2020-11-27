import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String args[]){
		
		double valor;
		double precio;
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("Introduzca o valor do producto con punto para os céntimos");
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
