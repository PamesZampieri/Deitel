package Unidad7;

public class LibroCalificaciones_1 {
    private String nombreDelCurso;
    private int[][] calificaciones;

    public LibroCalificaciones_1(String nombreDelCurso, int[][] calificaciones) {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void procesarCalificaciones() {
        imprimirCalificaciones();

        System.out.printf("%n%s %d%n%s %d%n%n",
                "La calificación más baja en el libro de calificaciones es", obtenerMinima(),
                "La calificación más alta en el libro de calificaciones es", obtenerMaxima());

        imprimirGraficoBarras();
    }

    public int obtenerMinima() {
        int califBaja = calificaciones[0][0];

        // itera a través de las filas del arreglo calificaciones
        for (int[] califEstudiantes : calificaciones) {
            // itera a través de las columnas de la fila actual
            for (int calificacion : califEstudiantes) {
                if (calificacion < califBaja) {
                    califBaja = calificacion;
                }
            }
        }

        return califBaja;
    }

    public int obtenerMaxima() {
        int califAlta = calificaciones[0][0];

        // itera a través de las filas del arreglo calificaciones
        for (int[] califEstudiantes : calificaciones) {
            // itera a través de las columnas de la fila actual
            for (int calificacion : califEstudiantes) {
                if (calificacion > califAlta) {
                    califAlta = calificacion;
                }
            }
        }

        return califAlta;
    }

    public double obtenerPromedio(int[] conjuntoCalif) {
        int total = 0;

        for (int calificacion : conjuntoCalif) {
            total += calificacion;
        }

        return (double) total / conjuntoCalif.length;
    }

    public void imprimirGraficoBarras() {
        System.out.println("Distribución de calificaciones en general:");

        int[] frecuencia = new int[11];

        for (int[] califEstudiantes : calificaciones) {
            for (int calificacion : califEstudiantes) {
                ++frecuencia[calificacion / 10];
            }
        }

        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            if (cuenta == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", cuenta * 10, cuenta * 10 + 9);
            }

            for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void imprimirCalificaciones() {
        System.out.println("Las calificaciones son:\n");
        System.out.print("                  "); // alinea encabezados de columnas

        // crea un encabezado de columna para cada una de las pruebas
        for (int prueba = 0; prueba < calificaciones[0].length; prueba++) {
            System.out.printf("Prueba %d     ", prueba + 1);
        }

        System.out.println("Promedio"); // encabezado de columna de promedio de estudiantes

        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d", estudiante + 1);

            for (int prueba : calificaciones[estudiante]) {
                System.out.printf("%13d", prueba);
            }

            double promedio = obtenerPromedio(calificaciones[estudiante]);
            System.out.printf("%12.2f%n", promedio);

        }
    }
}