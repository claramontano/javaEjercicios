package level1_beginner.ex11_ex20_condicionales_bucles;
import java.util.Scanner;

/** 
________________________________________________________
|                                                   	|
|   Ejercicio 20: Dibujar un triángulo de asteriscos.	|
|   Nivel: Beginner                                 	|
|   Tema: Fundamentos y Variables                   	|
|   Autor: Clara Montaño Rodríguez                  	|
|   Fecha: 07/12/2025                               	|
|_______________________________________________________|

*/

public class ex20DibujarTriangulo {

	public static void main(String[] args) {
		
		//1.Pedimos la altura del triángulo
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Introduce la altura del triángulo: ");
        int altura = entradaDatos.nextInt();

        //2.Dibujamos el triángulo
        //Bucle para cada fila
        for (int i = 1; i <= altura; i++) {

            //Bucle para imprimir los asteriscos de cada fila
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //Salto de línea al terminar cada fila
            System.out.println();
        }

        //3.Cerramos Scanner
        entradaDatos.close();
    }
}
