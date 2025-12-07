package level1_beginner.ex01_ex10_fundamentos_variables;

import java.util.Scanner;

/** 
____________________________________________________________________________________________________________
|																											|
|	Ejercicio 08: Solicita una temperatura, el tipo de medida y haz la conversión Celsius ↔ Fahrenheit.		|
|	Nivel: Beginner																							|
|	Tema: Fundamentos y Variables																			|
|	Autor: Clara Montaño Rodríguez																			|
|	Fecha: 07/12/2025																						|
|___________________________________________________________________________________________________________|

*/

public class ex08SolicitaTemperaturaYConversion {
	
	public static void main (String[]args) {
		
		//1.Solicitamos el número de la temperatura
		Scanner entradaDatos = new Scanner (System.in);
		System.out.println("Por favor, introduce la temperatura en dígitos: ");
		int temperatura = entradaDatos.nextInt();
		
		//2.Solicitamos el tipo de medida
		System.out.println("Por favor indica la unidad de medida (c) para celsius, (f) para Fahrenheit: ");
		String unidadMedida = entradaDatos.next();
		
        //3.Detectar la unidad usando equalsIgnoreCase
        if (unidadMedida.equalsIgnoreCase("c")) {
            System.out.println("Has indicado grados Celsius.");
            double celsiusAFahrenheit = temperatura * 1.8 + 32;
            System.out.println("Los grados que has introducido: " + temperatura + " Celsius, es igual a " + celsiusAFahrenheit + " Fahrenheit.");
            
        } else if (unidadMedida.equalsIgnoreCase("f")) {
            System.out.println("Has indicado grados Fahrenheit.");
            double fahrenheitACelsius = (temperatura - 32) / 1.8;
            System.out.println("Los grados que has introducido: " + temperatura + " Fahrenheit, es igual a " + fahrenheitACelsius + " Celsius.");
        } else {
            System.out.println("Unidad no válida.");
        }
        
        //4.Cerramos el Scanner
        entradaDatos.close();
    }

}
