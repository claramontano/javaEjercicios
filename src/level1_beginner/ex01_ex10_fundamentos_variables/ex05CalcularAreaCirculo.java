package level1_beginner.ex01_ex10_fundamentos_variables;

/** 
____________________________________________________________________
|																	|
|	Ejercicio 05: 5.	Calcular el área de un círculo.				|
|	Nivel: Beginner													|
|	Tema: Fundamentos y Variables									|
|	Autor: Clara Montaño Rodríguez									|
|	Fecha: 07/12/2025												|
|___________________________________________________________________|

*/

public class ex05CalcularAreaCirculo {

	public static void main(String[] args) {

		//1.Declaramos el radio del círculo y pi
		int radio = 5;
		double pi = 3.14;
		
		//2.Realizamos el cálculo del área de un círculo
		double areaCirculo = pi * Math.pow(radio, 2);
		
		//3.Mostramos el resultado
		System.out.println("El área del círculo cuyo radio es " + radio + " es: " + areaCirculo);
	}

}
