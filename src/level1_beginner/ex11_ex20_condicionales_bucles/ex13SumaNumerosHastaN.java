package level1_beginner.ex11_ex20_condicionales_bucles;

import java.util.Scanner;

/** 
________________________________________________
|												|
|	Ejercicio 13: Suma de números hasta n.		|
|	Nivel: Beginner								|
|	Tema: Fundamentos y Variables				|
|	Autor: Clara Montaño Rodríguez				|
|	Fecha: 07/12/2025							|
|_______________________________________________|

*/

public class ex13SumaNumerosHastaN {

	public static void main(String[] args) {
		
		//1.Solicitamos los números por consola.
		Scanner entradaDatos = new Scanner (System.in);
		System.out.println("Introduce el número hasta el que quieres llegar: ");
		int n = entradaDatos.nextInt();
		System.out.println("De cuanto en cuanto quieres ir sumando: ");
		int numeroSuma = entradaDatos.nextInt();
		
		//2.Hacemos las sumas hasta llegar a n y lo mostramos
		for (int i = 0; i <= n; i += numeroSuma) {
			System.out.println(i);
		}
		
		//3.Cerramos Scanner
		entradaDatos.close();
		
	}

}
