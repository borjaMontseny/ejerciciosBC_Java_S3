import java.util.Scanner; // Esto es para poder utilizar el Scanner

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el número:");
		Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
		int numeroEntregado = sc.nextInt(); // Recogemos el dato por teclado
		metodoFactorial(numeroEntregado); // Llamamos a la función con la variable que
											// tiene el valor recogido anteriormente
	}

	public static int metodoFactorial(int numero) {
		int totalResultado = 1; // Empezamos desde 1
		for (int i = 1; i <= numero; i++) {
			totalResultado = totalResultado * i; // Vamos a acumular el resultado en la propia variable una y otra vez.
			System.out.print(" " + totalResultado); // Imprimimos esa variable
		}
		return totalResultado;

	}

}
