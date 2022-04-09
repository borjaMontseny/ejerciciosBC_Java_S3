
public class pruebaPrimo {

	public static boolean esPrimo(int numero){
		  int contador = 2; // Por 2 pq por 1 todos son divisibles
		  boolean primo=true; // 
		  while ((primo) && (contador!=numero)){
		    if (numero % contador == 0)
		      primo = false;
		    contador++;
		  }
		  return primo;
		}

}