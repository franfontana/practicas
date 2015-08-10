//Define el sueldo que le corresponde al empleado de acuerdo a la cantidad de horas trabajadas y el valor de la hora

package e1;

import java.util.Scanner;
public class E1SueldoOperario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
        int horasTrabajadas;
        float costoHora;
        float sueldo;
        System.out.print("Ingrese la cantidad de horas trabajadas por el empleado:");
        horasTrabajadas=teclado.nextInt();
        System.out.print("Ingrese el valor de la hora:");
        costoHora=teclado.nextFloat();
        sueldo=horasTrabajadas * costoHora;
        System.out.print("El empleado debe cobrar:");
        System.out.print(sueldo);
	}

}
