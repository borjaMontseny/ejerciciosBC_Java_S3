import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[10]; // Creamos un array de enteros de 10 posiciones
		rellenarArray(numeros);
	}

	public static void rellenarArray(int[] numeros) {
		Scanner sc = new Scanner(System.in); // Instancio el objeto de la clase Scanner
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce un número: ");
			numeros[i] = sc.nextInt();
			
		}
		
		recorrerArray(numeros);
	}

	public static void recorrerArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición: " + i + " Valor: " + numeros[i]);
		}
	}
}
