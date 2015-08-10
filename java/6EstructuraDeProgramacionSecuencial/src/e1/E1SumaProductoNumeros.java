//Tenemos dos entradas num1 y num2 (recordar cuáles son los nombres de variables correctas), dos operaciones: realización de la suma y del producto de los valores ingresados y dos salidas, que son los resultados de la suma y el producto de los valores ingresados.

package e1;

import java.util.Scanner;
public class E1SumaProductoNumeros {

	public static String nuevalinea = System.getProperty("line.separator");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int num1,num2,suma,producto;
		System.out.print("Ingrese el primer valor:");
		num1=teclado.nextInt();
		System.out.print("Ingrese el segundo valor:");
		num2=teclado.nextInt();
		suma=num1+num2;
		System.out.print("La suma de los valores es:");
		System.out.print(suma);
		System.out.print(nuevalinea);
		producto=num1*num2;
		System.out.print("El producto de los valores es:");
		System.out.print(producto);
		
	}

}
