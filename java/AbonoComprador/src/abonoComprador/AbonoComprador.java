package abonoComprador;

import java.util.Scanner;
public class AbonoComprador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int cantidad;
		float precioArticulo,abonoTotal;
		System.out.print("Ingrese el precio del articulo:");
		precioArticulo = teclado.nextFloat();
		System.out.print("Ingrese la cantidad de articulos:");
		cantidad=teclado.nextInt();
		System.out.print("La suma a abonar es:");
		abonoTotal=precioArticulo*cantidad;
		System.out.print(abonoTotal);
	}

}
