package Unidad7;

public class PruebaCalificaciones_1 {
    public static void main(String[] args) {
        int[][] arregloCalif = {{87, 96, 70},
                                {68, 87, 90},
                                {94, 100, 90},
                                {100, 81, 82},
                                {83, 65, 85},
                                {78, 87, 65},
                                {85, 75, 83},
                                {91, 94, 100},
                                {76, 72, 84},
                                {87, 93, 73}};

        LibroCalificaciones_1 miLibroCalificaciones = new LibroCalificaciones_1("CS101 Introducción a la " +
                "programación en Java!", arregloCalif);

        System.out.printf("Bienvenido al libro de calificaciones para%n%s%n%n",
                miLibroCalificaciones.getNombreDelCurso());

        miLibroCalificaciones.procesarCalificaciones();
    }
}
