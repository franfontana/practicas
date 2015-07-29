package promedio3NotasAlumno;

import java.util.Scanner;
public class Promedio3NotasAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		float calificacion1, calificacion2, calificacion3;
    	System.out.print("Ingrese la primer calificacion del alumno:");
    	calificacion1=teclado.nextInt();
    	System.out.print("Ingrese la segunda calificacion del alumno:");
    	calificacion2=teclado.nextInt();
    	System.out.print("Ingrese la tercer calificacion del alumno:");
    	calificacion3=teclado.nextInt();
        float promedio;
        promedio=(calificacion1 + calificacion2 + calificacion3) / 3;
        System.out.println("El promedio del alumno es:" + promedio);
    	if (promedio >= 7) {
    	    System.out.print("Promocionado");
    	}
	}

}
