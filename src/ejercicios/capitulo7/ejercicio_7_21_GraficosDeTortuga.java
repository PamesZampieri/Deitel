/*
7.21 (Gráficos de tortuga) El lenguaje Logo hizo famoso el concepto de los gráficos de tortuga. Imagine a una
tortuga mecánica que camina portodo el cuarto, bajo el control de una aplicación en Java. La tortuga sostiene un
bolígrafo en una de dos posiciones, arriba o abajo. Mientras el bolígrafo está abajo, el animalito va trazando figuras a
medida que se va moviendo, y mientras el bolígrafo está arriba, la tortuga se mueve alrededor libremente, sin trazar
nada. En este problema usted simulará la operación de la tortuga y creará un bloc de dibujo computarizado.
Utilice un arreglo de 20 por 20 llamado piso, que se inicialice con ceros. Lea los comandos de un arreglo que
los contenga. Lleve el registro de la posición actual de la tortuga entodo momento, y si el bolígrafo se encuentra
arriba o abajo. Suponga que la tortuga siempre empieza en la posición (0, 0) del piso, con su bolígrafo hacia arriba. El
conjunto de comandos de la tortuga que su aplicación debe procesar se muestra en la figura 7.29.
A medida que la tortuga se vaya desplazando con el bolígrafo hacia abajo, asigne 1 a los elementos apropiados del
arreglo piso. Cuando se dé el comando 6 (mostrar el arreglo en pantalla), siempre que haya un 1 en el arreglo, muestre
un asterisco o cualquier carácter que usted elija. Siempre que haya un 0, muestre un carácter en blanco.
Escriba una aplicación para implementar las herramientas de gráficos de tortuga aquí descritas. Escriba varios
programas de gráficos de tortuga para dibujar figuras interesantes. Agregue otros comandos para incrementar el poder
de su lenguaje de gráficos de tortuga.
*/

package ejercicios.capitulo7;

import java.util.Scanner;

public class ejercicio_7_21_GraficosDeTortuga {
    private static final int[][] piso = new int[20][20];
    private static int[] comandos = {4, 6, 6, 2, 5, 6, 2, 4, 1, 6, 1, 4, 6, 1, 2, 7, 9};
    /*
    Comandos Creados:
    1- Herramienta NADA (Bolígrafo arriba).
    2- Herramienta BOLIGRAFO (Bolígrafo abajo).
    3- Herramienta BORRADOR (Borra).
    4- Voltear a la DERECHA (Dirección).
    5- Voltear a la IZQUIERDA (Dirección).
    6- AVANZAR, Cantidad de espacios (6, número de espacios).
    7- IMPRIMIR con caracter especial elegido.
    8- IMPRIMIR por defecto con "*" y " ".
    9- TERMINAR.
    */
    private static final int[] posicion = new int[2]; //Indice 0 para representar las filas y 1 para las columnas.
    private static String direccion = "ESTE"; //Comienza mirando a la derecha.
    private static String herramienta = "NADA"; //Bolígrafo arriba.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < comandos.length; i++) {
            switch (comandos[i]) {
                case 1:
                    herramienta = "NADA";
                    break;
                case 2:
                    herramienta = "BOLIGRAFO";
                    piso[posicion[0]][posicion[1]] = 1;
                    break;
                case 3:
                    herramienta = "BORRADOR";
                    piso[posicion[0]][posicion[1]] = 0;
                    break;
                case 4:
                    switch (direccion) {
                        case "NORTE":
                            direccion = "ESTE";
                            break;
                        case "ESTE":
                            direccion = "SUR";
                            break;
                        case "SUR":
                            direccion = "OESTE";
                            break;
                        default:
                            direccion = "NORTE";
                    }
                    break;
                case 5:
                    switch (direccion) {
                        case "NORTE":
                            direccion = "OESTE";
                            break;
                        case "OESTE":
                            direccion = "SUR";
                            break;
                        case "SUR":
                            direccion = "ESTE";
                            break;
                        default:
                            direccion = "NORTE";
                    }
                    break;
                case 6:
                    if (direccion.equals("ESTE")) {
                        for (int j = 0; j < comandos[i + 1]; j++) {
                            posicion[1]++;

                            if (herramienta.equals("BOLIGRAFO")) {
                                piso[posicion[0]][posicion[1]] = 1;
                            }
                            if (herramienta.equals("BORRADOR")) {
                                piso[posicion[0]][posicion[1]] = 0;
                            }
                        }
                    }

                    if (direccion.equals("SUR")) {
                        for (int j = 0; j < comandos[i + 1]; j++) {
                            posicion[0]++;

                            if (herramienta.equals("BOLIGRAFO")) {
                                piso[posicion[0]][posicion[1]] = 1;
                            }
                            if (herramienta.equals("BORRADOR")) {
                                piso[posicion[0]][posicion[1]] = 0;
                            }
                        }
                    }

                    if (direccion.equals("OESTE")) {
                        for (int j = 0; j < comandos[i + 1]; j++) {
                            posicion[1]--;

                            if (herramienta.equals("BOLIGRAFO")) {
                                piso[posicion[0]][posicion[1]] = 1;
                            }
                            if (herramienta.equals("BORRADOR")) {
                                piso[posicion[0]][posicion[1]] = 0;
                            }
                        }
                    }

                    if (direccion.equals("NORTE")) {
                        for (int j = 0; j < comandos[i + 1]; j++) {
                            posicion[0]--;

                            if (herramienta.equals("BOLIGRAFO")) {
                                piso[posicion[0]][posicion[1]] = 1;
                            }
                            if (herramienta.equals("BORRADOR")) {
                                piso[posicion[0]][posicion[1]] = 0;
                            }
                        }
                    }
                    i++;
                    break;
                case 7:
                    System.out.print("Escriba el caracter deseado para el Gráfico: ");
                    char caracter = entrada.next().charAt(0);

                    for (int[] fila : piso) {
                        for (int celda : fila) {
                            if (celda == 1) {
                                System.out.print(caracter);
                            } else {
                                System.out.print(' ');
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 8:
                    for (int[] fila : piso) {
                        for (int celda : fila) {
                            if (celda == 1) {
                                System.out.print('*');
                            } else {
                                System.out.print(' ');
                            }
                        }
                        System.out.println();
                    }
                    break;
                default:
            }
        }
    }
}