public class LambdaTest{
	public static void main(String[] args) {

		//Expresion lambda ==> representa un objeto de una interfaz funcional
		FunctionTest ft = () -> System.out.println("Hola Mundo 1111");//Implementacion del metodo abstracto "saludar()"
																 		 //de la Interfaz Funcional

		//ft.saludar();
		LambdaTest objeto = new LambdaTest();
		objeto.miMetodo(ft);
	}

	public void miMetodo(FunctionTest parametro){
		parametro.saludar();
	}

}