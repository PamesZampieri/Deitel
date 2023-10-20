/*
(Calculadora del índice de masa corporal) En el ejercicio 1.10 introdujimos la calculadora del índice de
masa corporal (BMI). Las fórmulas para calcular el BMI son
BMI = pesoEnLibras × 703
alturaEnPulgadas × alturaEnPulgadas
o
BMI = pesoEnKilogramos
alturaEnMetros × alturaEnMetros
Cree una calculadora del BMI que lea el peso del usuario en libras y la altura en pulgadas (o, si lo prefiere, el peso
del usuario en kilogramos y la altura en metros), para que luego calcule y muestre el índice de masa corporal del
usuario.
Muestre además la siguiente información del Departamento de Salud y Servicios Humanos/Instituto Nacional de
Salud para que el usuario pueda evaluar su BMI:

VALORES DE BMI
Bajo peso: menos de 18.5
Normal: entre 18.5 y 24.9
Sobrepeso: entre 25 y 29.9
Obeso: 30 o más

[Nota: en este capítulo aprendió a usar el tipo int para representar números enteros. Cuando se realizan los cálculos
del BMI con valores int, se producen resultados en números enteros. En el capítulo 3 aprenderá a usar el tipo double
para representar a los números con puntos decimales. Cuando se realizan los cálculos del BMI con valores double,
producen números con puntos decimales; a éstos se les conoce como números de “punto flotante”].
 */

package ejercicios.capitulo2;

import java.util.Scanner;

// Calculadora de Indice de Masa Corporal
public class Ejercicio_33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso;
        double altura;

        System.out.print("Escriba su peso: ");
        peso = entrada.nextDouble();

        System.out.print("Escriba su altura en metros: ");
        altura = entrada.nextDouble();

        System.out.printf("%nEste es su Indice de Masa Corporal: %f%n", peso / (altura * altura));

        System.out.println("\nVALORES DE BMI");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");
    }
}