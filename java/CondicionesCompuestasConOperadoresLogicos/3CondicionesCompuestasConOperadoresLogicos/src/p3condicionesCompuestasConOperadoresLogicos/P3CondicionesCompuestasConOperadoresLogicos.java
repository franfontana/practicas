//3) Se ingresan por teclado tres números, si todos los valores ingresados son menores a 10, imprimir en pantalla la leyenda "Todos los números son menores a diez".

package p3condicionesCompuestasConOperadoresLogicos;

import java.util.Scanner;
public class P3CondicionesCompuestasConOperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Ingrese el primer valor:");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo valor:");
		num2 = teclado.nextInt();
		System.out.println("Ingrese el tercer valor:");
		num3 = teclado.nextInt();
		if (num1 < 10 && num2 < 10 && num3 < 10){
			System.out.println("Todos los números son menores a diez");
		}
	}

}
