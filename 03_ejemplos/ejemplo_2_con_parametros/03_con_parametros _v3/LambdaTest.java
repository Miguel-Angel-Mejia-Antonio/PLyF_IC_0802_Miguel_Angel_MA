public class LambdaTest{
	public static void main(String[] args){

		//Expresion lambda ==> representa un objeto de una interfaz funcional
		Operaciones op = (num1, num2) -> System.out.println(num1+num2);

		op.imprimeSuma(5, 10);

		LambdaTest objeto = new LambdaTest();
		objeto.miMetodo((num1, num2) -> System.out.println(num1-num2), 20, 10);

		objeto.miMetodo((num1, num2) -> System.out.println(num1*num2), 20, 10);
	}

	public void miMetodo(Operaciones op, int num1, int num2){
		op.imprimeSuma(num1, num2);
	}
}
