public class Principal {
    public static void main(String[] args){

        CalculadoraInt objInt = (x, y) -> x + y;

        CalculadoraLong objLong = (x, y) -> x + y;

        Principal.engine(objInt);
        Principal.engine(objLong);

    }

    //Sobrecarga de Metodos
    private static void engine(CalculadoraInt cal){
        int x = 2, y = 4;
        int resultado = cal.calcular(x, y);
        System.out.println("Resultado = " + resultado);
    }

    private static void engine(CalculadoraLong cal){
        long x = 20, y = 4;
        long resultado = cal.calcular(x, y);
        System.out.println("Resultado = " + resultado);
    }

}
