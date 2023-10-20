/*
6.25 (Números primos) Se dice que un entero positivo es primo si puede dividirse solamente por 1 y por sí mismo.
Por ejemplo, 2, 3, 5 y 7 son primos, pero 4, 6, 8 y 9 no. Por definición, el número 1 no es primo.
a) Escriba un método que determine si un número es primo.
b) Use este método en una aplicación que determine y muestre en pantalla todos los números primos menores que 10,000.
¿Cuántos números hasta 10,000 tiene que probar para asegurarse de encontrar todos los números primos?
c) Al principio podría pensarse que n/2 es el límite superior para evaluar si un número n es primo, pero sólo
es necesario ir hasta la raíz cuadrada de n. Vuelva a escribir el programa y ejecútelo de ambas formas.
*/

package ejercicios.capitulo6;

public class ejercicio_6_25_NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("NÚMEROS PRIMOS:");

        for (int numero = 2; numero <= 1000; numero++) {
            if (esPrimo(numero)) {
                System.out.printf("%d%n", numero);
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero == 1) {
            return false;
        }

        int limiteSuperior = (int) Math.sqrt(numero);

        for (int i = 2; i <= limiteSuperior; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}