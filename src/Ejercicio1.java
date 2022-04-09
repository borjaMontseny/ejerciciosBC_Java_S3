import java.util.Scanner; // Esto es para poder utilizar el Scanner

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Elige el área que deseas calcular: Círculo, Triángulo o Cuadrado");
		Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
		String opcionDeseada = sc.nextLine(); // Guardo la respuesta en un String

		// Utilizaré un Switch que llamará a un método según la respuesta dada
		switch (opcionDeseada) {
		case "Círculo":
			System.out.println("El área del círculo es " + metodoCirculo(sc));
			break;
		case "Triángulo":
			System.out.println("El área del triángulo es " + metodoTriangulo(sc));
			break;
		case "Cuadrado":
			System.out.println("El área del cuadrado es " + metodoCuadrado(sc));
			break;
		}
	}

	public static double metodoCirculo(Scanner sc) { // Le pasamos por parámetro un objeto Scanner para recoger los
														// datos
		System.out.println("Vamos a calcular el área de un círculo");
		System.out.println("Introduce el radio");
		double radioCirculo = sc.nextDouble();
		double resultadoArea = Math.PI * (radioCirculo * radioCirculo);
		return resultadoArea;

	}

	public static double metodoTriangulo(Scanner sc) {
		System.out.println("Vamos a calcular el área de un triángulo");
		System.out.println("Introduce la base");
		double baseTriangulo = sc.nextDouble();
		System.out.println("Introduce la altura");
		double alturaTriangulo = sc.nextDouble();
		double resultadoArea = (baseTriangulo * alturaTriangulo) / 2;
		return resultadoArea;
	}

	public static double metodoCuadrado(Scanner sc) {
		System.out.println("Vamos a calcular el área de un cuadrado");
		System.out.println("Introduce el lado");
		double ladoCuadrado = sc.nextDouble();
		double resultadoArea = ladoCuadrado * ladoCuadrado;
		return resultadoArea;
	}
}