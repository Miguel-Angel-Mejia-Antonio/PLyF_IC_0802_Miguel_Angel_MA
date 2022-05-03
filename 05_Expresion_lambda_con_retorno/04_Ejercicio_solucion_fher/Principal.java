public class Principal {
    public static void main(String[] args){

        System.out.println(Principal.engine((long)5, (long)5).calculate(4, 4));

    }
    
    private static CalculadoraInt engine(int a, int b){
        return (x, y) -> a * b;
    }

    private static CalculadoraLong engine(long a, long b){
        return (x, y) -> a + b;
    }
}