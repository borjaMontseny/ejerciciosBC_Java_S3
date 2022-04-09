import java.util.Scanner; // Esto es para poder utilizar el Scanner
public class pruebaRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Inicio el objeto Scanner
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int resultadoFinal = suma(valor1,valor2);
		System.out.println(resultadoFinal);
	}
	
	public static int suma(int valorMetodo1, int valorMetodo2) {
		int resultadoSuma = valorMetodo1 + valorMetodo2;
		return resultadoSuma;
	}
}