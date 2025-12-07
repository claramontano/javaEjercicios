package level1_beginner.ex11_ex20_condicionales_bucles;

import java.util.Scanner;

/** 
____________________________________________________________________________________________
|																							|
|	Ejercicio 12: Imprimir la tabla de multiplicar de un número solicitado por consola.		|
|	Nivel: Beginner																			|
|	Tema: Fundamentos y Variables															|
|	Autor: Clara Montaño Rodríguez															|
|	Fecha: 07/12/2025																		|
|___________________________________________________________________________________________|

*/

public class ex12TablaDeMultiplicar {

	public static void main(String[] args) {

		//1.Solicitamos un número por consola
		Scanner entradaNumero = new Scanner (System.in);
		System.out.println("Introduce un número para imprimir su tabla de multiplicar: ");
		
		//2. Guardamos el número en una variable numero
		int numero = entradaNumero.nextInt();
		
		//3.Mediante un bucle for imprimimos la tabla de multiplicar
		for (int i = 0; i <= 10; i++){
			int resultado = numero * i;
			System.out.println(i + " X " + numero + " = " + resultado);
		}
		
		//4.Cerramos el Scanner
		entradaNumero.close();
	}

}
