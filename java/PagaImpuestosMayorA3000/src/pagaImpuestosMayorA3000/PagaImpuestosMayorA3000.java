package pagaImpuestosMayorA3000;

import java.util.Scanner;

public class PagaImpuestosMayorA3000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		float sueldo;
		System.out.print("Ingrese el sueldo del empleado:");
		sueldo=teclado.nextFloat();
		if (sueldo>3000){
			System.out.print("El empleado debe pagar impuestos");
		}
		
	}

}
