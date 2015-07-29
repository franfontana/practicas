//Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje de error si el número de cifras es mayor.

package numTresCifras;

import java.util.Scanner;
public class NumTresCifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num, suma;
		System.out.println("Ingrese un valor entero positivo:");
		num = teclado.nextInt();
		if (num > 0){
			suma = num+num;
			if (suma <= 18){
				System.out.println("El numero es de 1 cifra");
			}
				else {
					if (suma <= 198){
						System.out.println("El numero es de 2 cifra");
					}else{
						if (suma <= 1998){
							System.out.println("El numero es de 3 cifras");
						}else{
							System.out.println("El numero excede las 3 cifras. Fin del programa.");
						}
				}
			}
			
		}else{
			System.out.println("El numero no es positivo");
		}
	}

}
