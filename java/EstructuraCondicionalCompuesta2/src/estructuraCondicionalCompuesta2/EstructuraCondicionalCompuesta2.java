package estructuraCondicionalCompuesta2;

import java.util.Scanner;
public class EstructuraCondicionalCompuesta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
    	int num1,num2,suma,diferencia,producto,cociente;
    	System.out.print("Ingrese primer valor:");
    	num1=teclado.nextInt();
    	System.out.print("Ingrese segundo valor:");
    	num2=teclado.nextInt();
    	if (num1>num2) {
    		System.out.println(num1+" "+"Es mayor que"+" "+num2);
    		suma=num1+num2;
    		System.out.println("Su suma es:"+suma);
    		diferencia=num1-num2;
    		System.out.println("Su diferencia es:"+diferencia);
    		
    	} else {
    		System.out.println(num2+" "+"Es mayor que"+" "+num1);
    		producto=num1*num2;
    		System.out.println("Su producto es:"+producto);
    		cociente=num1/num2;
    		System.out.println("Su cociente es:"+cociente);
    	}
	}

}