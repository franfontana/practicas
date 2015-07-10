//Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.

package mayorDe3Numeros;

import java.util.Scanner;
public class MayorDe3Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int valor1,valor2,valor3;
		System.out.println("Ingrese tres valores");
		valor1 = teclado.nextInt();
		valor2 = teclado.nextInt();
		valor3 = teclado.nextInt();
		if (valor1!=valor2 && valor2!=valor3 && valor3!=valor1){
		if (valor1 > valor2){
			if (valor1 > valor3){
				System.out.println("El primer valor es el mayor de los tres");
			}else{
				if (valor3 > valor2){
					System.out.println("El tercer valor es el mayor");
				}
			}
		}else{
			if (valor2 > valor3){
				System.out.println("El segundo valor es el mayor de los tres");
			}else{
				System.out.println("El tercer valor es el mayor");
			}
		}
	}else{
		System.out.println("Fin del Prorgama. Al menos dos de los valores son iguales");
	}
}
}
