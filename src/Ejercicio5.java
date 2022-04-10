import java.util.Scanner; // Esto es para poder utilizar el Scanner

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Número a binario:");
		Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
		int numeroEntregado = sc.nextInt(); // Recogemos el dato por teclado
		System.out.println(metodoBinario(numeroEntregado)); // Llamamos a la función con la variable que
															// tiene el valor recogido anteriormente y la printamos
	}

	public static String metodoBinario(int numero) {
		String numeroBinario = "";
		while (numero != 0) {
			numeroBinario += String.valueOf(numero % 2);
			numero = numero / 2;
		}
		StringBuilder sb = new StringBuilder(numeroBinario); //
		sb.reverse(); // Esto para darle la vuelta
		return sb.toString(); // Esto transforma el StringBuilder a String
	}
}
