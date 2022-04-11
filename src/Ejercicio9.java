import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el tamaño del array: ");
		int tamañoArray = sc.nextInt(); // La variable que va a ser el tamaño del array
		int[] numeros = new int[tamañoArray]; // Array con tamaño = tamañoArray
		rellenarArray(numeros);
	}

	public static void rellenarArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100);

		}
		recorrerArray(numeros);
	}

	public static void recorrerArray(int[] numeros) {
		int sumaValores = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición: " + i + " ValorRandom: " + numeros[i]);
			sumaValores += numeros[i];
		}
		System.out.println("Resultado de la suma total: " + sumaValores);
	}

}
