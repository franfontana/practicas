//Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo.


package pumeroPositivoNegativo;

import java.util.Scanner;

public class NumeroPositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Ingrese un valor entero negativo o positivo");
		num = teclado.nextInt();
		if (num != 0){
			if (num > 0){
				System.out.println("El numero es positivo");
			}else{
				System.out.println("El numero es negativo");
			}
		}else{
			System.out.println("El numero es 0");
		}
	 }
}
