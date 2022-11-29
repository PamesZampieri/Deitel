/*
(Valor entero de un carácter) He aquí otro adelanto. En este capítulo, aprendió acerca de los enteros y el
tipo int. Java puede también representar letras en mayúsculas, en minúsculas y en una considerable variedad
de símbolos especiales. Cada carácter tiene su correspondiente representación entera. El conjunto de caracteres que
utiliza una computadora, junto con las correspondientes representaciones enteras de esos caracteres, se conocen
como el conjunto de caracteres de esa computadora. Usted puede indicar un valor de carácter en un programa con
sólo encerrar ese carácter entre comillas sencillas, como en ‘A’.
Usted puede determinar el equivalente entero de un carácter si antepone a ese carácter la palabra (int), como en
(int) ‘A’
Esta forma se conoce como operador de conversión de tipo (aprenderá sobre estos operadores en el capítulo 4.) La
siguiente instrucción imprime un carácter y su equivalente entero:
System.out.printf( “El caracter %c tiene el valor %d%n”, ‘A’, ((int) ‘A’));
Cuando se ejecuta esta instrucción, muestra el carácter A y el valor 65 (del conjunto de caracteres conocido como
Unicode
®) como parte de la cadena. El especificador de formato %c es un receptáculo para un carácter (en este caso,
el carácter ‘A’).
Utilizando instrucciones similares a la mostrada anteriormente en este ejercicio, escriba una aplicación que
muestre los equivalentes enteros de algunas letras en mayúsculas, en minúsculas, dígitos y símbolos especiales.
Muestre los equivalentes enteros de los siguientes caracteres: A B C a b c 0 1 2 $ * + / y el carácter en blanco.
 */

package ejercicios.capitulo2;


public class Ejercicio_29 {
    public static void main(String[] args) {
        System.out.printf("El caracter %c tiene el valor %d%n",'A', (int) 'A');
        System.out.printf("El caracter %c tiene el valor %d%n",'B', (int) 'B');
        System.out.printf("El caracter %c tiene el valor %d%n",'C', (int) 'C');
        System.out.printf("El caracter %c tiene el valor %d%n",'a', (int) 'a');
        System.out.printf("El caracter %c tiene el valor %d%n",'b', (int) 'b');
        System.out.printf("El caracter %c tiene el valor %d%n",'c', (int) 'c');
        System.out.printf("El caracter %c tiene el valor %d%n",'0', (int) '0');
        System.out.printf("El caracter %c tiene el valor %d%n",'1', (int) '1');
        System.out.printf("El caracter %c tiene el valor %d%n",'2', (int) '2');
        System.out.printf("El caracter %c tiene el valor %d%n",'$', (int) '$');
        System.out.printf("El caracter %c tiene el valor %d%n",'*', (int) '*');
        System.out.printf("El caracter %c tiene el valor %d%n",'+', (int) '+');
        System.out.printf("El caracter %c tiene el valor %d%n",'/', (int) '/');
        System.out.printf("El caracter %c tiene el valor %d%n",' ', (int) ' ');
    }
}
