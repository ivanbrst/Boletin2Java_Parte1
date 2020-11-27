import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main (String args[]) {
		
		int n;
		int m;
		int r;
		
		Scanner a=new Scanner(System.in);
		
		System.out.println("Introduzca o primeiro número");
		n=a.nextInt();
		
		System.out.println("Introduzca o segundo número");
		m=a.nextInt();
		
		if((n%2==0)&&(m%2==0)&&(n<50)&&(m<=500)&&(m>=100))
			{r=n+m;
			System.out.println("El resultado de su suma es "+r+"");}
		else{System.out.println("Error");}
				
	}
}