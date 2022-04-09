import java.util.Scanner; // Esto es para poder utilizar el Scanner
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el número");
		Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
		int numeroEntregado = sc.nextInt(); // Guardamos en un Int el número que recogemos
		boolean esPrimo = comprobadorPrimo(numeroEntregado); // Acumula el valor devuelto por 
															 // la funcion comprobadorPrimo
		if (esPrimo) { // Si es true es primo. Sino, no es primo
			System.out.println(numeroEntregado + " es un número primo");
		}else {
			System.out.println(numeroEntregado + " no es un número primo");
		}
		
	}
	// Creamos el método comprobadorPrino para saber si es primo, y lo devuelve
	public static Boolean comprobadorPrimo(int numero) {
		int comprobadorDivisible = 2; // Esta es la variable que va a hacer de divisor
		boolean esPrimo = true;
		while (esPrimo && comprobadorDivisible < numero) {
			if (numero % comprobadorDivisible == 0) {
				esPrimo=false;
			}
			comprobadorDivisible++;
		}
		return true;
		
	}

}