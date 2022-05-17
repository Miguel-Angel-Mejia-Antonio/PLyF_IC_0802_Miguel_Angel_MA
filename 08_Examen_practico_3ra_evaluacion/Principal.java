public class Principal{
	public static void main(String[] args){

		PruebaExamen new = pe PruebaExamen();

		pe.operacionPrueba((1,2,3) -> 1+2+3);
		operacionPrueba(5, 4);
		mensajeHola();
		mensajeHola("Miguel Angel Mejia");
		pe.operacionPrueba(5, operacionPrueba(1, 2), operacionPrueba(3, 4));
		miMetodo(pe);
		miMetodo(pe, 1, 2, 3);
	}

	private static void miMetodo(Object pruebaExamen){
		pruebaExamen.operacionPrueba(5, operacionPrueba(1, 2), operacionPrueba(3, 4));
	}

	private static void miMetodo(Object pruebaExamen, int val1, int val2, int val3){
		
	}
}