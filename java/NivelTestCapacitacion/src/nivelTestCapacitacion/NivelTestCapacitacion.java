//Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
//	Nivel máximo:	Porcentaje>=90%.
//	Nivel medio:	Porcentaje>=75% y <90%.
//	Nivel regular:	Porcentaje>=50% y <75%.
//	Fuera de nivel:	Porcentaje<50%.

package nivelTestCapacitacion;

import java.util.Scanner;
public class NivelTestCapacitacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		float respuestasOk, preguntas;
		float porcentaje;
		System.out.println("Ingrese la cantidad de preguntas de la capacitacion:");
		preguntas = teclado.nextInt();
		System.out.println("Ingrese la cantidad de respuestas OK:");
		respuestasOk = teclado.nextInt();
		porcentaje = respuestasOk/preguntas;
		if (porcentaje <= 1){
		if (porcentaje < 0.5){
			System.out.println("El alumno se encuentra FUERA DE NIVEL");
		}else{
			if ((porcentaje >= 0.5) && (porcentaje < 0.75)){
				System.out.println("El alumno se encuentra en NIVEL REGULAR");
			}else{
				if ((porcentaje >= 0.75) && (porcentaje < 0.9)){
					System.out.println("El alumno se encuentra en NIVEL MEDIO");
				}else{
					System.out.println("El alumno se encuentra en NIVEL MAXIMO");
				}
			}
		}
		
	}else{
			System.out.println("Los valores ingresados son incorrectos");
		}
}
}