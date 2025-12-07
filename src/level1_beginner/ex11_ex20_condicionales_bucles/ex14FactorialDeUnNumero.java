package level1_beginner.ex11_ex20_condicionales_bucles;

import java.util.Scanner;

/** 
________________________________________________
|												|
|	Ejercicio 14: Factorial de un número.		|
|	Nivel: Beginner								|
|	Tema: Fundamentos y Variables				|
|	Autor: Clara Montaño Rodríguez				|
|	Fecha: 07/12/2025							|
|_______________________________________________|

*/

public class ex14FactorialDeUnNumero {

	public static void main(String[] args) {

		//1.Solicitamos el número por pantalla
		Scanner entradaDatos = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		int numero = entradaDatos.nextInt();
		
		//2.Calculamos el factorial del número
		int i = 1;
		int factorial = 1;
		while (i <= numero) {
			factorial *=i;
			i++;
		}
		//3.Mostramos el resultado
		System.out.println("El factorial es: " + factorial);

		//4.Cerramos Scanner
		entradaDatos.close();
	}

}
