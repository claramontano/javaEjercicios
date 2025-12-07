package level1_beginner.ex01_ex10_fundamentos_variables;

import java.util.Scanner;
/** 
____________________________________________________________________
|																	|
|	Ejercicio 06: Solita un número y muestra si es par o impar.		|
|	Nivel: Beginner													|
|	Tema: Fundamentos y Variables									|
|	Autor: Clara Montaño Rodríguez									|
|	Fecha: 07/12/2025												|
|___________________________________________________________________|

*/

public class ex06MostrarParImpar {

	public static void main(String[] args) {
		
		//1.Abrimos Scanner para solicitar datos por consola
		Scanner entradaNumero = new Scanner (System.in);
		System.out.println("Introduce un número por favor: ");
		
		//2.Damos el valor introducido por consola a la variable numero
		int numero = entradaNumero.nextInt();
		
		//3.Comprobar si es par o impar y mostrarlo
		if (numero % 2 == 0) {
			System.out.println("El número " + numero + " es par.");
		}else {
			System.out.println("El número " + numero + " es impar.");

		}
		
        // 4. Cerrar Scanner
		entradaNumero.close();
	}

}
