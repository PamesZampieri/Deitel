/*
6.33 (Modificación del juego de Craps) Modifique el programa Craps de la figura 6.8 para permitir apuestas.
Inicialice la variable saldoBanco con $1,000. Pida al jugador que introduzca una apuesta. Compruebe que esa
apuesta sea menor o igual que saldoBanco y, si no lo es, haga que el usuario vuelva a introducir la apuesta hasta
que se ingrese un valor válido. Después de esto, comience un juego de Craps. Si el jugador gana, agregue la apuesta al
saldoBanco e imprima el nuevo saldoBanco. Si pierde, reste la apuesta al saldoBanco, imprima el nuevo
saldoBanco, compruebe si saldoBanco se ha vuelto cero y, de ser así, imprima el mensaje “Lo siento. ¡Se quedó
sin fondos!” A medida que el juego progrese, imprima varios mensajes para crear algo de “charla”, como “¡Oh!,
se esta yendo a la quiebra, verdad?”, o “¡Oh, vamos, arriésguese!”, o “La hizo en grande. ¡Ahora es tiempo de cambiar
sus fichas por efectivo!”. Implemente la “charla” como un método separado que seleccione en
forma aleatoria la cadena a mostrar.
 */

package ejercicios.capitulo6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ejercicio_6_33_CrapsModificado {
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    private enum Resultado {CONTINUA, GANO, PERDIO}

    private static final int DOS_UNOS = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int saldoBanco = 1000;

        System.out.print("Introduzca una apuesta:$ ");
        int apuesta = entrada.nextInt();

        while (apuesta > saldoBanco) {
            System.out.println("Ingrese un valor válido.");
            System.out.print("Introduzca una apuesta:$ ");
            apuesta = entrada.nextInt();
        }

        int miPunto = 0;
        Resultado estadoJuego;

        int sumaDeDados = tirarDados();

        switch (sumaDeDados) {
            case SIETE:
            case ONCE:
                estadoJuego = Resultado.GANO;
                break;
            case DOS_UNOS:
            case TRES:
            case DOCE:
                estadoJuego = Resultado.PERDIO;
                break;
            default:
                estadoJuego = Resultado.CONTINUA;
                miPunto = sumaDeDados;
                System.out.printf("El punto es %d%n", miPunto);
                break;
        }

        while (estadoJuego == Resultado.CONTINUA) {
            System.out.println(charla());

            sumaDeDados = tirarDados();

            if (sumaDeDados == miPunto) {
                estadoJuego = Resultado.GANO;
            } else {
                if (sumaDeDados == SIETE) {
                    estadoJuego = Resultado.PERDIO;
                }
            }

            if (estadoJuego == Resultado.CONTINUA) {
                System.out.println("Continua");
            }
        }

        if (estadoJuego == Resultado.GANO) {
            System.out.println("El jugador gana.");
            saldoBanco += apuesta;
            System.out.print("Saldo Banco es: $ " + saldoBanco);
        } else {
            System.out.println("El jugador pierde.");
            saldoBanco -= apuesta;
            System.out.println("Saldo Banco es: $ " + saldoBanco);
            if (saldoBanco == 0) {
                System.out.print("¡Lo siento! ¡Se quedó sin fondos!");
            }
        }
    }

    public static int tirarDados() {
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6);

        int suma = dado1 + dado2;

        System.out.printf("El jugador tiró %d + %d = %d%n", dado1, dado2, suma);

        return suma;
    }

    public static String charla() {
        switch (numerosAleatorios.nextInt(3)) {
            case 0:
                return "¡Oh! Se está yendo a la quiebra ¿verdad?";
            case 1:
                return "¡Oh, vamos, arriésguese!";
            default:
                return "¡La hizo en grande!.Ahora es tiempo de cambiar sus fichas por efectivo";
        }
    }
}
