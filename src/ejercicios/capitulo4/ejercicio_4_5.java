/*
      a) Declarar la variable suma de tipo int e inicializarla con 0.
      b) Declarar la variable x de tipo int e inicializarla con 1.
      c) Sumar la variable x a suma y asignar el resultado a la variable suma.
      d) Imprimir “La suma es: ”, seguido del valor de la variable suma.
*/

package ejercicios.capitulo4;

public class ejercicio_4_5 {
    public static void main(String[] args) {
        int suma = 0;
        int x = 1;
        suma += x;
        System.out.printf("La suma es: %d%n", suma);
    }
}