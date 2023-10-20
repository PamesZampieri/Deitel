/*
4.38 (Implementar la privacidad con la criptografía) El crecimiento explosivo de las comunicaciones de Internet y el
almacenamiento de datos en computadoras conectadas en red, ha incrementado de manera considerable los
problemas de privacidad. El campo de la criptografía se dedica a la codificación de datos para dificultar (y, mediante
los esquemas más avanzados, tratar de imposibilitar) su lectura a los usuarios no autorizados. En este ejercicio, usted
investigará un esquema simple para cifrar y descifrar datos.
Una compañía que desea enviar datos por Internet le pidió a usted que escribiera un programa que los cifre, de modo que
se puedan transmitir con más seguridad.
Todos los datos se transmiten como enteros de cuatro dígitos. Su aplicación debe leer un entero de cuatro dígitos
introducido por el usuario, y cifrarlo de la siguiente manera: reemplace cada dígito con el resultado de sumarle 7 y
obtenga el residuo después de dividir el nuevo valor entre 10. Después intercambie el primer dígito con el tercero, y
el segundo dígito con el cuarto. Luego imprima el entero cifrado.
Escriba una aplicación separada que reciba como entrada un entero de cuatro dígitos cifrado y lo descifre (invirtiendo
el esquema de cifrado) para formar el número original.[Proyecto de lectura opcional: investigue la “criptografía de
clave pública” en general y el esquema de clave pública específico PGP (privacidad bastante buena). Tal vez también
quiera investigar el esquema RSA, que se utiliza mucho en las aplicaciones de nivel industrial].
 */

package ejercicios.capitulo4;

import java.util.Scanner;

//Programa para descifrar un número.
public class ejercicio_4_38_Criptografia_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca un número cifrado de 4 dígitos: ");
        int cifrado = entrada.nextInt();

        int cifrado1 = cifrado / 1000;
        int cifrado2 = cifrado / 100 % 10;
        int cifrado3 = cifrado / 10 % 10;
        int cifrado4 = cifrado % 10;

        System.out.printf("El número descifrado es: %d%d%d%d%n", descifrar(cifrado3), descifrar(cifrado4),
                descifrar(cifrado1), descifrar(cifrado2));
    }

    public static int descifrar(int numero) {
        if (numero >= 7) {
            numero -= 7;
        } else {
            numero += 3;
        }

        return numero;
    }
}