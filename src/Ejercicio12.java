import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// 1- Crea un array de números (tamaño pasado por teclado) OK
		// 2- Rellénalo con números aleatorios entre 1 y 300 OK
		// 3- Muestra del array los números que acaben en un dígito (y comprueba)
		// 4- Guarda los números del paso 3 en un nuevo array

		Scanner sc = new Scanner(System.in); // Inicializamos el objeto Scanner
		System.out.print("Introduce el tamaño del array: "); // Mensaje por pantalla. Tamaño array1
		int tamanoArray = sc.nextInt(); // La variable que va a ser el tamaño del array
		int[] array1 = new int[tamanoArray]; // Array de Integers con tamaño = tamanoArray
		
		for (int i = 0; i < array1.length; i++) { // Rellenamos el array1 con ints randoms 1-300
			array1[i] = (int) ((Math.random() * 299)+1);
		}
		
		System.out.print("Introduce el 3r dígito y buscaremos los que acaben en este:"); // Mensaje por pantalla
		int digitoCoincidencia = sc.nextInt(); // Esta es la variable que compararemos con cada int del array
		

	}

	public static int digitoComprobador(int numeroX, int[] arrayEjemplo) {
		
		for (int i = 0; i < arrayEjemplo.length; i++) {
			
			String numeroString = (String.valueOf(numeroX)); // Pasa numeroX de Int a String en numeroString
			String numeroArray = (String.valueOf(arrayEjemplo[i])); // Pasa arrayEjemplo[i] de Int a String en numeroArray
			
			// Este If compara los Strings anteriores
			// El length retorna la largada de un valor Ej. 11.length = 2
			// Comprobamos la última posicion de un String teniendo en cuenta
			// Que habrá que restar la largada -1
			if (numeroString.equals(numeroArray.charAt(numeroArray.length()-1))) {
				
			}
		}
	}
	
}
