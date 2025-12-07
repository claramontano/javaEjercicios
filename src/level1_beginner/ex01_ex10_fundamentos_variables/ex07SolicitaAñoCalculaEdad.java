package level1_beginner.ex01_ex10_fundamentos_variables;

import java.util.Scanner;

/** 
____________________________________________________________________________________________________
|																									|
|	Ejercicio 07: Solicita el año de nacimiento y calcula la edad a partir del año de nacimiento.	|
|	Nivel: Beginner																					|
|	Tema: Fundamentos y Variables																	|
|	Autor: Clara Montaño Rodríguez																	|
|	Fecha: 07/12/2025																				|
|___________________________________________________________________________________________________|

*/

public class ex07SolicitaAñoCalculaEdad {

	public static void main(String[] args) {
		
		//1.Abrir Scanner para entrada de datos por consola.
		Scanner anioEntrada = new Scanner (System.in);
		System.out.println("Introduce tu año en formato AAAA: ");
		
        //2.Leer el año introducido
		int anioNacimiento = anioEntrada.nextInt();
		
		//3.Obtener el año actual automáticamente
        int anioActual = java.time.Year.now().getValue();

        //4.Validación del año
        if (anioNacimiento > anioActual) {
            System.out.println("El año introducido no es válido.");
            anioEntrada.close();
            return;
        }

        //5.Calcular la edad
        int edad = anioActual - anioNacimiento;

        //6. Mostrar el resultado
        System.out.println("Tienes " + edad + " años.");

        anioEntrada.close();
    }
}
