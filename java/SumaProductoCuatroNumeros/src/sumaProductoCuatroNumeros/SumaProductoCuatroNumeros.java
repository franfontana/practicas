package sumaProductoCuatroNumeros;

import java.util.Scanner;

public class SumaProductoCuatroNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num1,num2,num3,num4;
		int suma,producto;
		System.out.print("Ingrese el primer valor:");
		num1=teclado.nextInt();
		System.out.print("Ingrese el segundo valor:");
		num2=teclado.nextInt();
		System.out.print("Ingrese el tercer valor:");
		num3=teclado.nextInt();
		System.out.print("Ingrese el cuarto valor:");
		num4=teclado.nextInt();
		System.out.println("La suma de los primeros dos valores es:");
		suma=num1+num2;
		System.out.println(suma);
		System.out.println("El producto de los ultimos dos valores es:");
		producto=num3*num4;
		System.out.println(producto);
		
		producto=num3*num4;
	}

}
