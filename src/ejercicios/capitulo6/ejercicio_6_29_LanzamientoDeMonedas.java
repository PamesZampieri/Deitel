/*
6.29 (Lanzamiento de monedas) Escriba una aplicación que simule el lanzamiento de monedas. Deje que el
programa lance una moneda cada vez que el usuario seleccione la opción del menú “Lanzar moneda”. Cuente el número de
veces que aparezca cada uno de los lados de la moneda. Muestre los resultados. El programa debe llamar a un
método independiente, llamado tirar, que no tome argumentos y devuelva un valor de una enum llamada Moneda
(CARA y CRUZ). [Nota: si el programa simula en forma realista el lanzamiento de monedas, cada lado de la moneda debe
aparecer aproximadamente la mitad del tiempo].
*/

package ejercicios.capitulo6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ejercicio_6_29_LanzamientoDeMonedas {
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    private enum Moneda {CARA, CRUZ}

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba 1 para lanzar moneda o escriba 2 para ver los resultados: ");
        int opcion = entrada.nextInt();

        while (opcion != 1 && opcion != 2) {
            System.out.println("Error. La opción ingresada es incorrecta.");

            System.out.print("Escriba 1 para lanzar moneda o escriba 2 para ver los resultados: ");
            opcion = entrada.nextInt();

        }

        int cantidadCara = 0;
        int cantidadCruz = 0;

        while (opcion == 1) {
            switch (tirar()) {
                case CRUZ:
                    cantidadCruz++;
                    System.out.println("Cruz");
                    break;
                case CARA:
                    cantidadCara++;
                    System.out.println("Cara");
            }

            System.out.print("Escriba 1 para lanzar moneda, escriba 2 para ver los resultados: ");
            opcion = entrada.nextInt();
        }

        System.out.println("La cantidad de caras que se obtuvieron es: " + cantidadCara);
        System.out.println("La cantidad de cruz que se obtuvieron es: " + cantidadCruz);
    }

    public static Moneda tirar() {
        if (numerosAleatorios.nextInt(2) == 0) {
            return Moneda.CARA;
        }
        return Moneda.CRUZ;
    }
}