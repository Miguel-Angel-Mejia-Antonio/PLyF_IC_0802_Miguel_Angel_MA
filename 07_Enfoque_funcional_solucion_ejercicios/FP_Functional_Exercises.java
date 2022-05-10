import java.util.List;

public class FP_Functional_Exercises{

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API",
			"Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		System.out.println("EJERCICIO 01: ***************** IMPRIMIR NUMEROS IMPARES *****************");
		printNumerosImpar(numbers);
		System.out.println("\nEJERCICIO 02: ***************** IMPRIMIR LOS CURSOS *****************");
		printString1(courses);
		System.out.println("\nEJERCICIO 03: ***************** IMPRIMIR LOS CURSOS QUE TENGAN LA PALABRA Spring *****************");
		printFiltrados(courses);
		System.out.println("\nEJERCICIO 04: ***************** IMPRIMIR CURSOS QUE TENGAN AL MENOS 4 LETRAS *****************");
		printFiltrarCursosCuatro(courses);
		System.out.println("\nEJERCICIO 05: ***************** IMPRIMIR EL CUBO DE LOS NUMEROS IMPARES *****************");
		printNumerosImparCubes(numbers);
		System.out.println("\nEJERCICIO 06: ***************** IMPRIMIR EL NUMERO DE CARACTERES DE LOS CURSOS *****************");
		printStringLongitud(courses);

	}

	private static void print(int number){
		System.out.print("\t" + number + ", ");
	}

	private static void printString(String course){
		System.out.print("\t" + course + ", ");
	}

	private static boolean isEven(String course){
		return (course == "Spring" );
	}

	private static void printNumerosImpar(List<Integer> numbers){
		numbers.stream()
				.filter(number -> number % 2 != 0)
				.forEach(FP_Functional_Exercises::print);
		System.out.println("");
	}

	private static void printNumerosImparCubes(List<Integer> numbers){
		numbers.stream()
				.filter(number -> number % 2 != 0)
				.map(number -> number * number)
				.forEach(FP_Functional_Exercises::print);
		System.out.println("");
	}

	private static void printString1(List<String> courses){

		for (String course : courses) {
			System.out.print("\t" + course + ", ");	
		}
		System.out.println("");
	}

	private static void printStringLongitud(List<String> courses){

		for (String course : courses) {
			int longitud;
			longitud = course.length();					 //CONTADOR CON ESPACIOS
			//longitud = course.replace(" ", "").length(); 	 //CONTADOR SIN ESPACIOS
			System.out.print("\t" + "[" + course + " = " + longitud + "], " );	
		}
		System.out.println("");
	}

	private static void printFiltrados(List<String> courses){
		courses.stream()
				//.filter(FP_Functional_Exercises::isEven)
				.filter(course -> course.startsWith("Spring"))
				.forEach(FP_Functional_Exercises::printString);
		System.out.println("");
	}

	private static void printFiltrarCursosCuatro(List<String> courses){
		courses.stream()
				.filter(course -> course.length() <= 4)
				.forEach(FP_Functional_Exercises::printString);
		System.out.println("");
	}

}
