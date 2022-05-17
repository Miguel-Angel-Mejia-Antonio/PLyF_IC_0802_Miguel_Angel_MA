//PASO 1.- Crear una Interfaz pública de nombre "PruebaExamen"
public interface PruebaExamen{

	// PASO 2.- En esta Interfaz crear un método por defecto y público de nombre "mensajeHola" (no retorna nada y no recibe nada).
	public default void mensajeHola(){
		//PASO 3.- En ese método "mensajeHola" vas a imprimir un mensaje como el siguiente --> "Hola mi nombre es: Miguel Angel"
		System.out.println("Hola mi nombre es: Miguel Angel Mejia");
	}

	// PASO 4.- En esta misma Interfaz crear un método por defecto y público de nombre "mensajeHola", recibe como parámetro un String y vamos a imprimir ese String de la siguiente manera ---> La cadena es: " + cadena, (no retorna nada el método).
	public default void mensajeHola(String cadena){
		System.out.println("La cadena es: " + cadena);
	}

	// PASO 5.- En esta misma Interfaz crear un método público y estático de nombre "operacionPrueba", va a retornar un tipo de dato Entero y va a recibir dos parámetros de tipo Entero.
	public static int operacionPrueba(int valor1, int valor2){
		// PASO 6.- En este método "operacionPrueba" (del paso 5) retornar la suma de los dos argumentos (2 ENTEROS) recibidos.
		int resultado = valor1 + valor2;
		return resultado;
	}

	// PASO 7.- En esta misma Interfaz "PruebaExamen", crear un método público y abstracto de nombre "operacionPrueba", no va a retornar NADA y va a recibir tres parámetros de tipo Entero.
	public void operacionPrueba(int valor1, int valor2, int valor3);

}
