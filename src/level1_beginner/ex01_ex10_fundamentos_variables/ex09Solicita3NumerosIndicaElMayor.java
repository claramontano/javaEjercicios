package level1_beginner.ex01_ex10_fundamentos_variables;

import java.util.Scanner;

/** 
____________________________________________________________________________________
|																					|
|	Ejercicio 09: Solicita 3 números por consola y muestra el mayor de 3 números.	|
|	Nivel: Beginner																	|
|	Tema: Fundamentos y Variables													|
|	Autor: Clara Montaño Rodríguez													|
|	Fecha: 07/12/2025																|
|___________________________________________________________________________________|

*/

public class ex09Solicita3NumerosIndicaElMayor {

	public static void main(String[] args) {

		//1.Solicitamos los 3 números y lo guardamos en variables.
		Scanner entradaNumero = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		int num1 = entradaNumero.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int num2 = entradaNumero.nextInt();
		
		System.out.println("Introduce el tercer número: ");
		int num3 = entradaNumero.nextInt();
		
		//2.Buscamos el número mayor y lo mostramos
		int mayor = num1;

		if (num2 > mayor) {
		    mayor = num2;
		}

		if (num3 > mayor) {
		    mayor = num3;
		}

		//3.Mostrar resultado
		System.out.println("El número mayor es: " + mayor);

		//4.Cerramos Scanner
		entradaNumero.close();

	}
}