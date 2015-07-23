//1) Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad.

package verificarSiDichaFechaCorrespondeANavidad;

import java.util.Scanner;
public class VerificarSiDichaFechaCorrespondeANavidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int dia, mes, ano;
		System.out.println("Ingrese el dia de la fecha");
		dia = teclado.nextInt();
		System.out.println("Ingrese el mes de la fecha");
		mes = teclado.nextInt();
		System.out.println("Ingrese el ano de la fecha");
		ano = teclado.nextInt();
		if(dia == 25 && mes == 12){
			System.out.println("Es navidad!!!");
		}
	}

}
