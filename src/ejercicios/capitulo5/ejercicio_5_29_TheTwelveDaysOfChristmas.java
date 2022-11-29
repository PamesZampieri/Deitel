/*
5.29 (Canción “Los doce días de Navidad”) Escriba una aplicación que utilice instrucciones de repetición y
switch para imprimir la canción “Los doce días de Navidad” (The Twelve Days of Christmas). Una instrucción switch
debe utilizarse para imprimir el día (es decir, “first”, “second”, etcétera). Una instrucción switch separada debe
utilizarse para imprimir el resto de cada verso. Visite el sitio Web
en.wikipedia.org/wiki/The_Twelve_Days_of_Christmas_(song)para obtener la letra completa de la canción.
*/

package ejercicios.capitulo5;

import java.util.Scanner;

public class ejercicio_5_29_TheTwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un día del 1 al 12, de la canción The Twelve Days of Christmas que desea conocer: ");
        int day = entrada.nextInt();
        String diaEscrito;

        while (day != -1) {
            switch (day) {
                case 1:
                    diaEscrito = "first";
                    break;
                case 2:
                    diaEscrito = "second";
                    break;
                case 3:
                    diaEscrito = "third";
                    break;
                case 4:
                    diaEscrito = "fourth";
                    break;
                case 5:
                    diaEscrito = "fifth";
                    break;
                case 6:
                    diaEscrito = "sixth";
                    break;
                case 7:
                    diaEscrito = "seventh";
                    break;
                case 8:
                    diaEscrito = "eighth";
                    break;
                case 9:
                    diaEscrito = "ninth";
                    break;
                case 10:
                    diaEscrito = "tenth";
                    break;
                case 11:
                    diaEscrito = "11th";
                    break;
                default:
                    diaEscrito = "12th";
            }

            System.out.printf("On the %s day of Christmas%n", diaEscrito);
            System.out.println("My true love sent to me");

            switch (day) {
                case 12:
                    System.out.print("Twelve drummers drumming\n");
                case 11:
                    System.out.print("Eleven pipers piping\n");
                case 10:
                    System.out.print("Ten lords a-leaping\n");
                case 9:
                    System.out.print("Nine ladies dancing\n");
                case 8:
                    System.out.print("Eight maids a milking\n");
                case 7:
                    System.out.print("Seven swans a swimming\n");
                case 6:
                    System.out.print("Six geese a laying\n");
                case 5:
                    System.out.print("Five golden rings\n");
                case 4:
                    System.out.print("Four calling birds\n");
                case 3:
                    System.out.print("Three French hens\n");
                case 2:
                    System.out.print("Two turtle-doves\n");
                    System.out.print("And a partridge in a pear tree\n");
                    break;
                case 1:
                    System.out.print("A partridge in a pear tree\n");
            }
            System.out.println();

            System.out.print("Escriba un día del 1 al 12, de la canción The Twelve Days of Christmas que desea conocer: ");
            day = entrada.nextInt();
        }
    }
}
