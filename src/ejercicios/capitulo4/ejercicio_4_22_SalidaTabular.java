/*
4.22 (Salida tabular) Escriba una aplicación en Java que utilice ciclos para imprimir la siguiente tabla de valores:
N 10*N 100*N 1000*N
1 10 100 1000
2 20 200 2000
3 30 300 3000
4 40 400 4000
5 50 500 5000
 */

package ejercicios.capitulo4;

public class ejercicio_4_22_SalidaTabular {
    public static void main(String[] args) {
        int N = 1;

        System.out.println("N\t\t\t10*N\t\t\t100*N\t\t\t1000*N");
        System.out.println();

        while (N < 6) {
            System.out.printf("%d\t\t\t%d\t\t\t\t%d\t\t\t\t%d%n", N, N * 10, N * 100, N * 1000);
            N++;
        }
    }
}
