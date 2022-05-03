public class Principal {
    public static void main(String[] args){

        System.out.println("===> CalculadoraLong --> Resultado = " + Principal.engine((long)5, (long)6).calculate(5,6));
        System.out.println("===> CalculadoraLong --> Resultado = " + Principal.engine((long)10, (long)10).calculate(10,10));
        System.out.println("===> CalculadoraInt --> Resultado = " + Principal.engine((int)9, (int)5).calculate(9,5));
        //System.out.println("===> CalculadoraLong --> Resultado = " + Principal.engine().calculate(6, 2));
        //System.out.println("===> CalculadoraLong --> Resultado = " + CalculadoraInt.engine().calculate(5, 5));

    }
    
    private static CalculadoraInt engine(int x1, int x2){
        return (x, y) -> x + y;
    }

    private static CalculadoraLong engine(long x1, long x2){
        return (x, y) -> x * y;
    }
}