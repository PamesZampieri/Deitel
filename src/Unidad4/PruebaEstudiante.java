package Unidad4;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante cuenta1 = new Estudiante("Jane Green", 93.5);
        Estudiante cuenta2 = new Estudiante("John Blue", 72.75);

        System.out.printf("La calificación en letra de %s es: %s%n",
                cuenta1.obtenerNombre(), cuenta1.obtenerCalificacionEstudiante());
        System.out.printf("La calificación en letra de %s es: %s%n",
                cuenta2.obtenerNombre(), cuenta2.obtenerCalificacionEstudiante());
    }
}