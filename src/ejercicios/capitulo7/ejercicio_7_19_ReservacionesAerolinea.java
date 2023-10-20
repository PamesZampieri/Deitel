/*
7.19 (Sistema de reservaciones de una aerolínea) Una pequeña aerolínea acaba de comprar una computadora para su nuevo
sistema de reservaciones automatizado. Se le ha pedido a usted que desarrolle el nuevo sistema. Usted escribirá una
aplicación para asignar asientos en cada vuelo del único avión de la aerolínea (capacidad: 10 asientos).
Su aplicación debe mostrar las siguientes alternativas:
Por favor escriba 1 para Primera Clase y Por favor escriba 2 para Economico.
Si el usuario escribe 1, su aplicación debe asignarle un asiento en la sección de primera clase (asientos 1 a 5).
Si el usuario escribe 2, su aplicación debe asignarle un asiento en la sección económica (asientos 6 a 10).
Su aplicación deberá entonces imprimir un pase de abordar, indicando el número de asiento de la persona y si se encuentra
en la sección de primera clase o clase económica.
Use un arreglo unidimensional del tipo primitivo boolean para representar la tabla de asientos del avión.
Inicialice todos los elementos del arreglo con false para indicar que todos los asientos están vacíos. A medida que se
asigne cada asiento, establezca el elemento correspondiente del arreglo en true para indicar que ese asiento ya no está
disponible.
Su aplicación nunca deberá asignar un asiento que ya haya sido asignado. Cuando esté llena la sección económica, su
programa deberá preguntar a la persona si acepta ser colocada en la sección de primera clase (y viceversa). Si la persona
acepta, haga la asignación de asiento apropiada. Si no, imprima el mensaje “El proximo vuelo sale en 3 horas”.
*/

package ejercicios.capitulo7;

import java.util.Scanner;

public class ejercicio_7_19_ReservacionesAerolinea {
    private static final Scanner entrada = new Scanner(System.in);
    private static final boolean[] asientos = new boolean[10];
    private static int paseDeAbordaje = 1;
    private static int asientoPrimeraClaseAAsignar = 0;
    private static int asientoClaseEconomicaAAsignar = 5;
    private static int asientosPrimeraClaseDisponibles = 5;
    private static int asientosClaseEconomicaDisponibles = 5;

    public static void main(String[] args) {
        while (asientosPrimeraClaseDisponibles > 0 || asientosClaseEconomicaDisponibles > 0) {
            System.out.print("Escriba (1) para seleccionar primera clase o (2) para clase económica: ");
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                if (asientosPrimeraClaseDisponibles > 0) {
                    setAsientosPrimeraClase();
                } else {
                    System.out.println("Primera clase está completa.");
                    System.out.println();
                    System.out.print("Escriba (1) si quiere cambiar a clase económica o (2) si no lo desea: ");
                    opcion = entrada.nextInt();

                    if (opcion == 1) {
                        setAsientosClaseEconomica();
                    } else if (opcion == 2) {
                        System.out.println("El próximo vuelo sale en 3 horas.");
                        break;
                    }
                }
            } else if (opcion == 2) {
                if (asientosClaseEconomicaDisponibles > 0) {
                    setAsientosClaseEconomica();
                } else {
                    System.out.println("Clase económica está completa.");
                    System.out.println();
                    System.out.print("Escriba (1) si quiere cambiar a primera clase o (2) si no lo desea: ");
                    opcion = entrada.nextInt();

                    if (opcion == 1) {
                        setAsientosPrimeraClase();
                    } else if (opcion == 2) {
                        System.out.println("El próximo vuelo sale en 3 horas.");
                        break;
                    }
                }
            }
        }

        if (asientosPrimeraClaseDisponibles == 0 && asientosClaseEconomicaDisponibles == 0) {
            System.out.println("Este vuelo se encuentra completo.");
        }
    }

    public static void setAsientosPrimeraClase() {
        asientos[asientoPrimeraClaseAAsignar] = true;

        System.out.printf("Pase de abordaje número: %d, número de asiento: %d, Primera Clase.%n%n",
                paseDeAbordaje, asientoPrimeraClaseAAsignar + 1);

        asientoPrimeraClaseAAsignar++;
        paseDeAbordaje++;
        asientosPrimeraClaseDisponibles--;
    }

    public static void setAsientosClaseEconomica() {
        asientos[asientoClaseEconomicaAAsignar] = true;

        System.out.printf("Pase de abordaje número: %d, número de asiento: %d, Clase Económica.%n%n",
                paseDeAbordaje, asientoClaseEconomicaAAsignar + 1);

        asientoClaseEconomicaAAsignar++;
        paseDeAbordaje++;
        asientosClaseEconomicaDisponibles--;
    }
}