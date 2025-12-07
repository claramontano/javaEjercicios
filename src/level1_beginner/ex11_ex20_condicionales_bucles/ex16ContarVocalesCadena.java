package level1_beginner.ex11_ex20_condicionales_bucles;

/** 
____________________________________________
|											|
|	Ejercicio 16: Contar vocales cadena. 	|
|	Nivel: Beginner							|
|	Tema: Fundamentos y Variables			|
|	Autor: Clara Montaño Rodríguez			|
|	Fecha: 07/12/2025						|
|___________________________________________|

*/


public class ex16ContarVocalesCadena {

	public static void main(String[] args) {

		//1.Iniciamos una cadena
		String contarVocales = "Esto es una cadena para contar vocales.";
		
		//2.Creamos un contador
		int contador = 0;
		
		//3.Recorremos la cadena caracter a caracter
		for (int i = 0; i < contarVocales.length(); i++) {
			
			char letra = contarVocales.charAt(i); //Obtenemos cada caracter
			
			//4.Comprobamos si el caracter es vocal (mayus o minus)
			if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u' || 
				letra=='A' || letra=='E' || letra=='I' || letra=='O' || letra=='U') {
				
				contador++;
			}
			
		}
		
		//5.Mostramos resultado
		System.out.println("En la frase: " + contarVocales + " Hay " + contador + " vocales.");
	}

}
