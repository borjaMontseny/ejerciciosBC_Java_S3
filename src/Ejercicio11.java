import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// 1- Declara dos arrays con la dimensión pasada por teclado OK
		// 2- array1 rellenado por números aleatorios. array2 apunta a array1 (array2 = array1) OK
		// 3- Reasigna los valores de array2 con valores aleatorios OK
		// 4- Crea un método que tenga como parámetros 2 arrays, y devuelva uno nuevo
		//    con la multiplicación array1[0] * array2[0] OK
		// 5- Muestra el contenido de cada array OK
		
		Scanner sc = new Scanner(System.in); // Inicializamos el objeto Scanner
		System.out.print("Introduce el tamaño del array: "); // Mensaje por pantalla. Tamaño array1
		int tamanoArray = sc.nextInt(); // La variable que va a ser el tamaño del array
		int[] array1 = new int[tamanoArray]; // Array de Integers con tamaño = tamanoArray

		for (int i = 0; i < array1.length; i++) { // Este for rellenará array1
			array1[i] = (int) (Math.random() * 100); // Cada posición de array1 tendrá un int random guardado

		}

		int[] array2 = array1;

		for (int i = 0; i < array1.length; i++) { // Rellenamos el array1 de randoms
			array2[i] = (int) (Math.random() * 100);
		}

		int[] array3 = arrayNum3(array1, array2); // Llamamos al método que * los arrays

		mostrarArray(array1); // Método que sirve para mostrar una array

		mostrarArray(array2);

		mostrarArray(array3);

	}

	public static int[] arrayNum3(int[] arrayNum1, int[] arrayNum2) {
		int[] arrayNum3 = new int[arrayNum1.length];
		for (int i = 0; i < arrayNum3.length; i++) {
			arrayNum3[i] = arrayNum1[i] * arrayNum2[i];
		}
		return arrayNum3;
	}

	public static void mostrarArray(int[] array) {
		System.out.println("");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}

}
