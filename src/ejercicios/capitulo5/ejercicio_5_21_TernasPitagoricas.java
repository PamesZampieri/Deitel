/*
5.21 (Ternas pitagóricas) Un triángulo rectángulo puede tener lados cuyas longitudes sean valores enteros. El
conjunto de tres valores enteros para las longitudes de los lados de un triángulo rectángulo se conoce como terna
pitagórica. Las longitudes de los tres lados deben satisfacer la relación que establece que la suma de los cuadrados de
dos lados es igual al cuadrado de la hipotenusa. Escriba una aplicación que muestre una tabla de las ternas pitagóricas
para lado1, lado2 y la hipotenusa, que no sean mayores de 500. Use un ciclo for triplemente anidado para probar todas
las posibilidades. Este método es un ejemplo de la computación de “fuerza bruta”. En cursos de ciencias computacionales
más avanzados aprenderá que existen muchos problemas interesantes para los cuales no hay otra metodología algorítmica
conocida, más que el uso de la fuerza bruta.
*/

package ejercicios.capitulo5;

public class ejercicio_5_21_TernasPitagoricas {
    public static void main(String[] args) {
        System.out.printf("%32s%n%s%20s%20s%n", "TERNAS PITAGÓRICAS", "LADO 1", "LADO 2", "HIPOTENUSA");

        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500; j++) {
                for (int k = 1; k <= 500; k++) {
                    if ((i * i) == (j * j) + (k * k)) {
                        System.out.printf("%6d%20d%20d%n", j, k, i);
                    }
                }
            }
        }
    }
}
