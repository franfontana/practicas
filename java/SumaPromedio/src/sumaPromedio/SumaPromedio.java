package sumaPromedio;

import java.util.Scanner;
public class SumaPromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num1,num2,num3,num4,suma;
		float promedio;
		System.out.print("Ingrese el primer valor:");
		num1=teclado.nextInt();
		System.out.print("Ingrese el segundo valor:");
		num2=teclado.nextInt();
		System.out.print("Ingrese el tercer valor:");
		num3=teclado.nextInt();
		System.out.print("Ingrese el cuarto valor:");
		num4=teclado.nextInt();
		System.out.print("La Suma de los valores es:");
		suma=num1+num2+num3+num4;
		System.out.println(suma);
		System.out.print("El promedio de los valores es:");
		promedio=suma/4;
		System.out.println(promedio);
		
	}

}
