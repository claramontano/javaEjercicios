package level1_beginner.ex01_ex10_fundamentos_variables;

import java.util.Scanner;

/** 
________________________________________________________________________________________
|																						|
|	Ejercicio 10: Solicita un número por pantalla y comprueba si es múltiplo de 3 y 5.	|
|	Nivel: Beginner																		|
|	Tema: Fundamentos y Variables														|
|	Autor: Clara Montaño Rodríguez														|
|	Fecha: 07/12/2025																	|
|_______________________________________________________________________________________|

*/


public class ex10SolicitaNumeroMultiploDe3Y5 {

	public static void main(String[] args) {

		//1.Solicitamos el número
		Scanner entradaNumero = new Scanner (System.in);
		System.out.println("Introduce un número por favor: ");
		int numero = entradaNumero.nextInt();
		
		//2.Comprobamos si es múltiplo de 3 y de 5
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El número " + numero + " es múltiplo de 3 y de 5.");
        } 
        else if (numero % 3 == 0) {
            System.out.println("El número " + numero + " es múltiplo solo de 3.");
        } 
        else if (numero % 5 == 0) {
            System.out.println("El número " + numero + " es múltiplo solo de 5.");
        } 
        else {
            System.out.println("El número " + numero + " no es múltiplo ni de 3 ni de 5.");
        }
		//3.Cerramos el Scanner
		entradaNumero.close();
	}

}
