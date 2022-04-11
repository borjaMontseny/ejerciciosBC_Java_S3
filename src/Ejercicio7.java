import java.util.Scanner; // Esto es para poder utilizar el Scanner

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
		System.out.print("Introduzca L=Libras, D=Dólares, Y=Yenes ");
		String opcionDeseada = sc.next().toUpperCase(); // Guardamos el valor en un String y lo pasamos a Mayus
		System.out.print("Introduce la cantidad de € ");
		double cantidadEuros = sc.nextDouble(); // Recogemos el dato Double por teclado
		metodoConversion(cantidadEuros, opcionDeseada);
	}

	public static void metodoConversion(double numero, String opcionDeseada) {
		double resultadoConversion = 0;
		if (opcionDeseada.charAt(0) == 'L') {
			resultadoConversion = numero * 0.86;
			System.out.println(numero + "€ son " + "£" + resultadoConversion);
		} else if (opcionDeseada.charAt(0) == 'D') {
			resultadoConversion = numero * 1.28611;
			System.out.println(numero + "€ son " + resultadoConversion + "$");
		} else if (opcionDeseada.charAt(0) == 'Y') {
			resultadoConversion = numero * 129.852;
			System.out.println(numero + "€ son " + resultadoConversion + "¥");
		}

	}
}
