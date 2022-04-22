public class LambdaTest{
	public static void main(String[] args){

		//Expresion lambda ==> representa un objeto de una interfaz funcional
		Operaciones op = (num1, num2) -> System.out.println(num1+num2);

		op.imprimeSuma(5, 10);
	}
}