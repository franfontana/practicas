//Lee tres números distintos y nos muestre el mayor

package lee3NumerosNosMuestraElMayor;

import java.util.Scanner;
public class Lee3NumerosNosMuestraElMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Ingrese el primer valor");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo valor");
		num2 = teclado.nextInt();
		System.out.println("Ingrese el tercer valor");
		num3 = teclado.nextInt();
		if(num1>num2 && num1>num3){
			System.out.println("El primer numero es el mayor:" + num1);
		} else{
			if(num2>num3){
				System.out.println("El segundo valor es el mayor:" + num2);
			} else{
				System.out.println("El tercer valor es el mayor:" + num3);
			}
		}
	}

}
