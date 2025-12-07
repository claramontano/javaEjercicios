package level1_beginner.ex11_ex20_condicionales_bucles;

import java.util.Scanner;

/** 
________________________________________________
|                                             	|
|   Ejercicio 19: Contar dígitos de un número. 	|
|   Nivel: Beginner                            	|
|   Tema: Fundamentos y Variables              	|
|   Autor: Clara Montaño Rodríguez             	|
|   Fecha: 07/12/2025                          	|
|_______________________________________________|

*/

public class ex19ContarDigitosNumero {

	public static void main(String[] args) {

        //1.Pedimos el número al usuario
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Introduce un número para contar sus dígitos: ");
        int numero = entradaDatos.nextInt();

        //2.Contador de dígitos
        int contador = 0;

        int copia = numero;  // guardamos el original para mostrarlo después

        //3.Mientras el número sea mayor que 0, lo dividimos entre 10
        while (numero > 0) {
            numero /= 10;   // quitamos el último dígito
            contador++;     // aumentamos el contador
        }

        //4.Mostramos el resultado
        System.out.println("El número " + copia + " tiene " + contador + " dígitos.");
        
        //5.Cerramos Scanner
        entradaDatos.close();
    }
}