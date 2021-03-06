// PASO 1.- Crear una clase pública y de nombre "Principal".
public class Principal{

	//PASO 2.- Dentro de esta clase "Principal" crear el punto de entrada "main".
	public static void main(String[] args){

		//PASO 3.- Crear una instancia de tipo "PruebaExamen" y de nombre "pe", <<pero sin asignar memoria>>.
		PruebaExamen pe;
		
		// PASO 4.- Asignar una Expresión lambda a la instancia "pe", en la cual se imprima la suma de TRES números Enteros. * CUIDADO AQUI <---
		pe = (int val1, int val2, int val3) -> System.out.println(val1 + val2 + val3);

		// PASO 5.- Invocar "operacionPrueba" e imprimir el resultado de la suma de DOS números Enteros.
		System.out.println(PruebaExamen.operacionPrueba(5, 2));

		// PASO 6.- Invocar "mensajeHola".
		pe.mensajeHola();

		// PASO 7.- Invocar "mensajeHola" y enviar cualquier String.
		pe.mensajeHola("Miguel Angel Mejia Antonio");

		// PASO 8.- Asignar una Expresión lambda a la instancia "pe", en la cual se imprima la suma del primer argumento con la multiplicación del segundo argumento por el tercer argumento.
		pe = (int val1, int val2, int val3) -> System.out.println(val1 + (val2 * val3));

		// PASO 9.- Con "pe" invocar a "operacionPrueba", pasando como primer argumento cualquier número Entero, 
		// pasando como segundo argumento el resultado obtenido de invocar "operacionPrueba" que recibe dos Enteros 
		// (los que tú desees) y pasando como tercer argumento el resultado obtenido de invocar "operacionPrueba" 
		// que recibe dos Enteros (los que tú desees). 
		pe.operacionPrueba(5, PruebaExamen.operacionPrueba(5, 2), PruebaExamen.operacionPrueba(5, 2));

		// PASO 12.- Regresando al punto de entrada "MAIN", invocar al método "miMetodo" pasando como argumento a "pe".
		miMetodo(pe);
		
		// PASO 13.- Invocar al método "miMetodo", pasando como argumento una Expresión lambda, en la cual se 
		//imprima la suma del primer argumento con la división del segundo argumento entre el tercer argumento.
		miMetodo((int val1, int val2, int val3) -> System.out.println(val1 + (val2 / val3)));

		// PASO 16.- Regresando al punto de entrada "MAIN", asignar una Expresión lambda a la instancia "pe", 
		//en la cual se imprima la suma del primer argumento con la división del segundo argumento entre el tercer argumento 
		//(DEBE IMPRIMIR LOS DECIMALES). <-- AQUI LO DEBES HACER (DECIMALES)
		pe = (int val1, int val2, int val3) -> System.out.println((float)val1 + ((float)val2 / (float)val3));

		// PASO 17.- Invocar al método "miMetodo" y enviar como primer argumento a "pe", y tres Enteros cualesquiera.
		miMetodo(pe, 5, 6, 7);

	}

	// PASO 10.- Dentro la clase "Principal" (NO en el punto de Entrada MAIN), crear un método estático y privado de nombre 
	//"miMetodo", el cual no retorna NADA y recibe como argumento un Objeto de tipo "PruebaExamen".
	private static void miMetodo(PruebaExamen pe){

		// PASO 11.- Dentro del método "miMetodo" (del paso 10), repetir lo mismo que el punto "9", pero con el objeto que se recibe como argumento.
		pe.operacionPrueba(5, PruebaExamen.operacionPrueba(5, 2), PruebaExamen.operacionPrueba(5, 2));
	}

	// PASO 14.- Dentro la clase "Principal" (NO en el punto de Entrada MAIN), crear un método estático y privado de nombre "miMetodo", 
	//el cual no retorna NADA y recibe como argumento un Objeto de tipo "PruebaExamen", y tres valores de tipo Entero (separados).
	private static void miMetodo(PruebaExamen pe, int val1, int val2, int val3){

		// PASO 15.- Dentro del método "miMetodo" (creado en el punto 14), utilizar el objeto recibido para invocar a "operacionPrueba", 
		//pasando como primer argumento el primer valor Entero recibido, pasando como segundo argumento el resultado 
		//obtenido de invocar "operacionPrueba" que recibe dos Enteros (el segundo valor recibido) y pasando como tercer argumento el 
		//resultado obtenido de invocar "operacionPrueba" que recibe dos Enteros (el tercer valor recibido). 
		pe.operacionPrueba(val1, PruebaExamen.operacionPrueba(val1, val2), PruebaExamen.operacionPrueba(val3, val3));
	}


}






