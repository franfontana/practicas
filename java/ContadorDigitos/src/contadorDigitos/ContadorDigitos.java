//Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
//mostrar un mensaje indicando si el número tiene uno o dos dígitos.
//(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)

package contadorDigitos;

import java.util.Scanner;
public class ContadorDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero,suma;
		System.out.println("Ingrese un valor entero y positivo:");
		numero = teclado.nextInt();
		if (numero > 0){
			suma = numero+numero;
			if (suma <= 18){
				System.out.println("El numero es de 1 digito");
			}
				else {
					if (suma <= 198){
						System.out.println("El numero es de 2 digitos");
					}
				}
			}
			
		else {
			System.out.println("El numero no es positivo");
		}
			
		}
			
}


