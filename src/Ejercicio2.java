import java.util.Scanner; // Esto es para poder utilizar el Scanner
import java.util.Random; // Esto importa la Clase random de java.util

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cuántos números deaseas randomizar?");
		Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
		int cantidadNum = sc.nextInt();
		generadorRandom(cantidadNum);
	}

	public static void generadorRandom(int cantidadNum) { // Este método recoge el dato dado por teclado
		for (int i = 0; i < cantidadNum; i++) { // i=0,
			int randomNum = (int) (Math.random() * 101); // Esto nos da un random entre 1 y 100
			System.out.println(randomNum);

		}

	}
}