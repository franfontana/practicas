package correspondeAlPrimerTrimestreDelAno;

import java.util.Scanner;
public class CorrespondeAlPrimerTrimestreDelAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int dia, mes, ano;
		System.out.println("Ingrese numero de dia:");
		dia = teclado.nextInt();
		System.out.println("Ingrese numero de mes:");
		mes = teclado.nextInt();
		System.out.println("Ingrese numero de ano");
		ano = teclado.nextInt();
		if(mes == 1 || mes == 2 || mes == 3){
			System.out.println("Corresponde al primer trimestre");
		}
	}

}
