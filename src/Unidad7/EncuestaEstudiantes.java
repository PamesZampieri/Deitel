package Unidad7;

public class EncuestaEstudiantes {
    public static void main(String[] args) {
        int[] respuestas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frecuencia = new int[6];
        //int[] frecuencia = { 0, 3, 4, 8, 2, 2 };
        //        Indices:     0  1  2  3  4  5

        for (int i = 0; i < respuestas.length; i++) {
            try {
                ++frecuencia[respuestas[i]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); //Invoca al método toString() para obtener el mensaje de error almacenado en el objeto excepción y mostrarlo.
                System.out.printf("   respuestas[%d] = %d%n%n", i, respuestas[i]);
            }
        }

        System.out.printf("%s%12s%n", "Calificación", "Frecuencia");

        for (int calificacion = 1; calificacion < frecuencia.length; calificacion++) {
            System.out.printf("%6d%10d%n", calificacion, frecuencia[calificacion]);
        }
    }
}