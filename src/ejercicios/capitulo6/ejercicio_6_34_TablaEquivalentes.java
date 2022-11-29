/*
6.34 (Tabla de números binarios, octales y hexadecimales) Escriba una aplicación que muestre una tabla de los
equivalentes en binario, octal y hexadecimal de los números decimales en el rango de 1 al 256. Si no está familiarizado
con estos sistemas numéricos, lea el apéndice J primero.
*/

package ejercicios.capitulo6;

public class ejercicio_6_34_TablaEquivalentes {
    public static void main(String[] args) {
        System.out.println("DECIMAL:\t\t\tBINARIO:\t\t\tOCTAL:\t\t\tHEXADECIMAL:");

        for (int i = 1; i <= 256; i++) {
            System.out.printf("%d\t\t\t\t\t%s\t\t\t%s\t\t\t\t%s", i, decimalABinario(i), decimalAOctal(i),
                    decimalAHexadecimal(i));
            System.out.println();
        }
    }

    public static String decimalABinario(int numero) {
        String resultado = "";

        for (int i = 8; i >= 0; i--) {
            int potencia = (int) Math.pow(2, i);

            if (potencia > numero) {
                resultado += '0';
            } else {
                resultado += '1';
                numero -= potencia;
            }
        }

        return resultado;
    }

    public static String decimalAOctal(int numero) {
        String resultado = "";

        for (int i = 2; i >= 0; i--) {
            int potencia = (int) Math.pow(8, i);

            if (potencia > numero) {
                resultado += '0';
            } else {
                int cantidadVeces = numero / potencia;
                resultado += cantidadVeces;
                numero -= (potencia * cantidadVeces);
            }
        }

        return resultado;
    }

    public static String decimalAHexadecimal(int numero) {
        String resultado = "";

        for (int i = 1; i >= 0; i--) {
            int potencia = (int) Math.pow(16, i);

            if (potencia > numero) {
                resultado += '0';
            } else {
                int cantidadVeces = numero / potencia;
                if (cantidadVeces > 9) {
                    resultado += ((char) (cantidadVeces + 55));
                } else {
                    resultado += cantidadVeces;
                }
                numero -= (potencia * cantidadVeces);
            }
        }

        return resultado;
    }
}
