package level1_beginner.ex11_ex20_condicionales_bucles;

import java.util.Scanner;

/** 
________________________________________________________
|														|
|	Ejercicio 15: Serie Fibonacci hasta n términos.		|
|	Nivel: Beginner										|
|	Tema: Fundamentos y Variables						|
|	Autor: Clara Montaño Rodríguez						|
|	Fecha: 07/12/2025									|
|_______________________________________________________|

*/

public class ex15SerieFibonacci {

	public static void main(String[] args) {
		
		//1.Solicitamos el término n
		Scanner entradaDatos = new Scanner (System.in);
		System.out.println("Introduce el número de términos que quieres calcular en la serie de Fibonacci: ");
		int n = entradaDatos.nextInt();
		
		//2. Calculamos y mostramos
        int a = 0;  // primer término
        int b = 1;  // segundo término
        int contador = 1;

        while (contador <= n) {
            System.out.println(a);

            int siguiente = a + b;  
            a = b;                  
            b = siguiente;          

            contador++;
        }
        
        //3.Cerramos Scanner
        entradaDatos.close();
    }
}
		
		

