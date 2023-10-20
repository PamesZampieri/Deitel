/*
(Enteros menor y mayor) Escriba una aplicación que lea cinco enteros y que determine e imprima los enteros
mayor y menor en el grupo. Use solamente las técnicas de programación que aprendió en este capítulo.
 */

package ejercicios.capitulo2;

import java.util.Scanner;

public class Ejercicio_24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;

        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();

        System.out.print("Escriba el tercer entero: ");
        numero3 = entrada.nextInt();

        System.out.print("Escriba el cuarto entero: ");
        numero4 = entrada.nextInt();

        System.out.print("Escriba el quinto entero: ");
        numero5 = entrada.nextInt();

        if (numero1 > numero2) {
            if (numero1 > numero3) {
                if (numero1 > numero4) {
                    if (numero1 > numero5) {
                        System.out.printf("%d es el mayor%n", numero1);
                    }
                }
            }
        }

        if (numero2 > numero1) {
            if (numero2 > numero3) {
                if (numero2 > numero4) {
                    if (numero2 > numero5) {
                        System.out.printf("%d es el mayor%n", numero2);
                    }
                }
            }
        }

        if (numero3 > numero1) {
            if (numero3 > numero2) {
                if (numero3 > numero4) {
                    if (numero3 > numero5) {
                        System.out.printf("%d es el mayor%n", numero3);
                    }
                }
            }
        }

        if (numero4 > numero1) {
            if (numero4 > numero2) {
                if (numero4 > numero3) {
                    if (numero4 > numero5) {
                        System.out.printf("%d es el mayor%n", numero4);
                    }
                }
            }
        }

        if (numero5 > numero1) {
            if (numero5 > numero2) {
                if (numero5 > numero3) {
                    if (numero5 > numero4) {
                        System.out.printf("%d es el mayor%n", numero5);
                    }
                }
            }
        }


        if (numero1 < numero2) {
            if (numero1 < numero3) {
                if (numero1 < numero4) {
                    if (numero1 < numero5) {
                        System.out.printf("%d es el menor%n", numero1);
                    }
                }
            }
        }

        if (numero2 < numero1) {
            if (numero2 < numero3) {
                if (numero2 < numero4) {
                    if (numero2 < numero5) {
                        System.out.printf("%d es el menor%n", numero2);
                    }
                }
            }
        }

        if (numero3 < numero1) {
            if (numero3 < numero2) {
                if (numero3 < numero4) {
                    if (numero3 < numero5) {
                        System.out.printf("%d es el menor%n", numero3);
                    }
                }
            }
        }

        if (numero4 < numero1) {
            if (numero4 < numero2) {
                if (numero4 < numero3) {
                    if (numero4 < numero5) {
                        System.out.printf("%d es el menor%n", numero4);
                    }
                }
            }
        }

        if (numero5 < numero1) {
            if (numero5 < numero2) {
                if (numero5 < numero3) {
                    if (numero5 < numero4) {
                        System.out.printf("%d es el menor%n", numero5);
                    }
                }
            }
        }
    }
}