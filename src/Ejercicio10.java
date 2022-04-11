import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*  1- Crea un array de tamaño pedido por teclado
			2- Rellena el array de números aleatorios primos
			3- Indica (con un Método) cual es el número más grande
		*/
		Scanner sc = new Scanner(System.in); // Inicializamos el objeto Scanner
		System.out.print("Introduce el tamaño del array: ");
		int tamanoArray = sc.nextInt(); // La variable que va a ser el tamaño del array
		int[] numeros = new int[tamanoArray]; // Array de Integers con tamaño = tamanoArray
		
		numeros = rellenarArray(numeros); // El Método con el parametro numeros, me da la informacion, exacta para ese array
	
		mostrarLista(numeros);
		numeroMaximo(numeros);
	}

	public static void numeroMaximo(int[] numero) {
		int numeroMayor = 0;
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] > numeroMayor) {
				numeroMayor = numero[i];
			}
		}
		System.out.println("El número más grande del array es " + numeroMayor);
	
	}
	public static boolean esPrimo(int numero) {
		if (numero == 1) {
			return false;
		}
		for (int i = 2; i < numero - 1; i++) { // for (inicio ; final ; increment)
			if (numero % i == 0) { // Si entra no es primo
				return false;
			}
		}
		return true; // Es primo
	}
	public static int generadorRandom() {
	return (int) (Math.random() * 100); // Generamos un integer random
	}
	
	public static int[] rellenarArray(int[] numero) {
		boolean recipienteParaResultadoMetodoEsPrimo = false;
		for (int i = 0; i < numero.length; i++) {
			recipienteParaResultadoMetodoEsPrimo = false;
			while (recipienteParaResultadoMetodoEsPrimo == false) { // Repetir hasta que sea primo
				numero[i] = generadorRandom(); // Guardamos en la posición: un numero random
				recipienteParaResultadoMetodoEsPrimo = esPrimo(numero[i]);
			}			
		}
		return numero;
	}
	public static void mostrarLista(int[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}