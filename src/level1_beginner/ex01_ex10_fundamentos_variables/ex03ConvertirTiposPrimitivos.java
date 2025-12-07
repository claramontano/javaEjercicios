package level1_beginner.ex01_ex10_fundamentos_variables;

/** 
	____________________________________________________
	|													|
	|	Ejercicio 03: Convertir tipos primitivos.		|
	|	Nivel: Beginner									|
	|	Tema: Fundamentos y Variables					|
	|	Autor: Clara Montaño Rodríguez					|
	|	Fecha: 07/12/2025								|
	|___________________________________________________|

*/

public class ex03ConvertirTiposPrimitivos {
	
	public static void main (String[]args) {
		
		// 1. Declaración de variables originales
		double doubleOriginal = 10.52;
		int intOriginal = 20;
		String texto = "123";
		
		// 2. Conversión automática (widening)
		// Convertimos un int en un double (Java lo hace automáticamente)
		double doubleWidening = intOriginal;
		
		
		// 3. Conversión explícita (casting)
		// Convertimos un double en un int (se pierden decimales)
		int intCasting = (int) doubleOriginal;
		
		
		// 4. Conversión entre primitivo y String
		// Número → Texto
		
		String textoDesdeNumero = String.valueOf(texto);
		
		// Texto → Número
		int numeroDesdeTexto = Integer.parseInt(texto);
		
		// 5. Mostrar los resultados
		System.out.println("----- Conversión de tipos primitivos -----");
		
		System.out.println("Valor original double: " + doubleOriginal);
		System.out.println("Valor original int: " + intOriginal);
		
		System.out.println("\nConversión automática (int → double):");
		System.out.println("doubleWidening = " + doubleWidening);
		
		System.out.println("\nConversión explícita (double → int):");
		System.out.println("intCasting = " + intCasting);
		
		System.out.println("\nConversión número → String:");
		System.out.println("textoDesdeNumero = " + textoDesdeNumero);
		
		System.out.println("\nConversión String → número:");
		System.out.println("numeroDesdeTexto = " + numeroDesdeTexto);
		
	}
}
