package estructuraCondicionalCompuesta1;

import java.util.Scanner;
public class EstructuraCondicionalCompuesta1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
    	int num1,num2;
    	System.out.print("Ingrese primer valor:");
    	num1=teclado.nextInt();
    	System.out.print("Ingrese segundo valor:");
    	num2=teclado.nextInt();
    	if (num1>num2) {
    		System.out.print(num1+" "+"Es mayor que"+" "+num2);
    	} else {
    		System.out.print(num2+" "+"Es mayor que"+" "+num1);
    	}
	}

}
