package level1_beginner.ex11_ex20_condicionales_bucles;

/** 
____________________________________________
|											|
|	Ejercicio 18: Invertir una cadena.		|
|	Nivel: Beginner							|
|	Tema: Fundamentos y Variables			|
|	Autor: Clara Montaño Rodríguez			|
|	Fecha: 07/12/2025						|
|___________________________________________|

*/


public class ex18InvertirCadena {

	public static void main(String[] args) {

		//1.Iniciamos una cadena
        String texto = "Hola mundo";

        //2.Creamos una cadena vacía para guardar el resultado
        String invertida = "";

        //3.Recorremos la cadena desde el final hasta el principio
        int i = texto.length() - 1;
        while (i >= 0) {
            invertida += texto.charAt(i);
            i--;
        }

        //4.Mostramos el resultado
        System.out.println("Cadena original: " + texto);
        System.out.println("Cadena invertida: " + invertida);
    }
}