package level1_beginner.ex01_ex10_fundamentos_variables;

/** 
	____________________________________________________________________
	|																	|
	|	Ejercicio 04: Sumar, restar, multiplicar y dividir dos números.	|
	|	Nivel: Beginner													|
	|	Tema: Fundamentos y Variables									|
	|	Autor: Clara Montaño Rodríguez									|
	|	Fecha: 07/12/2025												|
	|___________________________________________________________________|

*/

public class ex04SumarRestarMultiplicarDividir {

	public static void main (String[]args) {
		
		//1.Declaramos las variables (los números)
		int num1 = 10;
		int num2 = 5;
		
		//2.Realizamos las operaciones
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2;
		int division = num1 / num2;
		
		//3.Mostramos los resultados
		System.out.println("El primer número es: " + num1);
		System.out.println("El segundo número es: " + num2);
		System.out.println(num1 + " + " + num2 + " = " + suma);
		System.out.println(num1 + " - " + num2 + " = " + resta);
		System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
		System.out.println(num1 + " / " + num2 + " = " + division);


		
	}
}
