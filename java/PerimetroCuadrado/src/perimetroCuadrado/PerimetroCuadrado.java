package perimetroCuadrado;

import java.util.Scanner;
public class PerimetroCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int lado, perimetro;
		System.out.println("Ingrese el valor del lado del Cuadrado:");
		lado = teclado.nextInt();
		perimetro=lado*4;
		System.out.println("El perimetro del cuadrado es:"+perimetro);
	}

}
