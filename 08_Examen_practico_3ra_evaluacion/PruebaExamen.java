public interface PruebaExamen {
	
	public void hola(){

	}

	public void mensajeHola(){
		System.out.println("Hola mi nombre es Miguel Angel");
	}

	public void mensajeHola(String mensaje){
		System.out.println("La cadena es: " + mensaje);
	}

	public static void operacionPrueba(int dato1, int dato2){
		int resultado;
		resultado = dato1 + dato2;
		return resultado;
	}

	public static void operacionPrueba(int val1, int val2, int val3){

	} 

}