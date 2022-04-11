import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * 1- Introducir un número por teclado
		 * 2- Mediante un método, contar las cifras
		 * 3- Mostrar por pantalla el número de cifras
		 */
		Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
		System.out.print("Introduce un número ");
		int numeroEntregado = sc.nextInt(); // Guardamos en un Int el número que recogemos por teclado
		int resultado = contarCifras(numeroEntregado);
		System.out.println("El número tiene " + resultado + " cifras");

	}

	public static int contarCifras(int numero) {
		int contadorCifras = 0;
		while (numero != 0) {
			numero = numero / 10;
			contadorCifras++;
		}
		return contadorCifras;
	}
}
