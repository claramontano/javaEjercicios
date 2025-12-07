package level1_beginner.ex11_ex20_condicionales_bucles;

/** 
____________________________________________
|											|
|	Ejercicio 17: Detectar Palíndromos. 	|
|	Nivel: Beginner							|
|	Tema: Fundamentos y Variables			|
|	Autor: Clara Montaño Rodríguez			|
|	Fecha: 07/12/2025						|
|___________________________________________|

*/

public class ex17DetectarPalindromos {

	public static void main(String[] args) {

		//1.Iniciamos una cadena
        String texto = "La ruta natural";

        //2.Preparamos la cadena (quitamos espacios y pasamos a minúsculas)
        String limpio = texto.replace(" ", "").toLowerCase();

        //3.Invertimos la cadena
        String invertido = "";
        for (int i = limpio.length() - 1; i >= 0; i--) {
            invertido += limpio.charAt(i);
        }

        //4.Comparamos
        if (limpio.equals(invertido)) {
            System.out.println("\"" + texto + "\"" + " ES un palíndromo.");
        } else {
            System.out.println("\"" + texto + "\"" + " NO es un palíndromo.");
        }
    }
}