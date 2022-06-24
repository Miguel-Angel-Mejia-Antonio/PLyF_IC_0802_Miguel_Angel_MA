import java.util.Scanner;

public class Nreinas {
    final int numFilas;
    final int numColumnas;
    int[][] tablero;
    int     contador;

    public Nreinas(int nf) {
        numFilas    = nf;
        numColumnas = nf;
        tablero     = new int[nf][nf];
    }

    //Mediante esta funcion llenamos el tablero con las N reinas
    public void mostrarTablero() {
        for(int i=0; i<tablero.length; i++) {
            for(int j=0; j<tablero[i].length; j++) {
                if(tablero[i][j]>0) System.out.printf("  %2d  |", tablero[i][j]);
                else System.out.printf("      |", tablero[i][j]);
            }
            System.out.println();
            for(int j=0; j<tablero[i].length; j++) System.out.print("------+");
            System.out.println();
        }
    }

    //Con esta funcion llenamos las reinas en el tablero
    public boolean resolverProblema(int f, int c, int num) {
            contador++;
            tablero[f][c] = num;
            if(num==numFilas) return true;
            int[][] posibles = buscarPosibles();
            for(int i=0; i<posibles.length; i++) {
                if(resolverProblema(posibles[i][0], posibles[i][1], num+1)) return true;
            }
            tablero[f][c]=0;
            return false;
    }

    //En este metodo buscamos las posibles posiciones donde se asignara a la reina
    int[][] buscarPosibles() {
        int[][] resp = new int[numFilas*numColumnas][2];
        int[] sumaFilas = new int[numColumnas];
        int[] sumaColumnas = new int[numFilas];
        int     pos  = 0;
        for(int i=0; i<numFilas; i++) {
            for(int j=0; j<numColumnas; j++) {
                if(tablero[i][j]>0) {
                    sumaFilas[i]++;
                    sumaColumnas[j]++;
                }
            }
        }
        for(int i=0; i<numFilas; i++) {
            if(sumaFilas[i]>0) continue;
            for(int j=0; j<numColumnas; j++) {
                if(sumaColumnas[j]>0) continue;
                if(i>0 && j>0             && tablero[i-1][j-1] > 0) continue;
                if(i>0 && j<numColumnas-1 && tablero[i-1][j+1] > 0) continue;
                if(i<numFilas-1 && j>0    && tablero[i+1][j-1] > 0) continue;
                if(i<numFilas-1 && j<numColumnas-1 && tablero[i+1][j+1] > 0) continue;
                resp[pos][0]=i;
                resp[pos][1]=j;
                pos++;
            }
        }
        int[][] tmp = new int[pos][2];
        for(int i=0; i<pos; i++) { tmp[i][0] = resp[i][0]; tmp[i][1]=resp[i][1]; }
        return tmp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.util.Random rnd  = new java.util.Random();
        int numFilas      = 4;
        System.out.print("Numero de reinas a ingresar: ");
        numFilas = sc.nextInt();
        System.out.println("");
        int filaInicial   = rnd.nextInt(numFilas);
        int colInicial    = rnd.nextInt(numFilas);
        Nreinas pr = new Nreinas(numFilas);
        pr.resolverProblema(filaInicial, colInicial,1);
        pr.mostrarTablero();
       //System.out.printf("Cantidad de veces que entra al ciclo: %,d %n",  pr.contador);
    }
}