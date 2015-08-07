//2) Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero con el segundo y a este resultado se lo multiplica por el tercero.

package sumaDePrimeroConSegundoMultiTercero;

import java.util.Scanner;
public class SumaDePrimeroConSegundoMultiTercero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, suma, sumaportercero;
		System.out.println("Ingrese el primer valor:");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo valor:");
		num2 = teclado.nextInt();
		System.out.println("Ingrese el tercer valor:");
		num3 = teclado.nextInt();
		if(num1 == num2 && num2 == num3){
			suma = num1 + num2;
			System.out.println("La suma del primero con el segundo es:" + suma);
			sumaportercero = suma*num3;
			System.out.println("La suma multiplicada por el tercer valor es:" + sumaportercero);
		}
	}

}
