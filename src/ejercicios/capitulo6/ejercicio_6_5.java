/*
6.5 Encuentre el error en cada uno de los siguientes segmentos de programas. Explique cómo se puede corregir.
*/

package ejercicios.capitulo6;

public class ejercicio_6_5 {
    /*
        a) void g()
    {
     System.out.println(“Dentro del método g”);
    void h()
     {
     System.out.println(“Dentro del método h”);
     }
    }
    */
    void g() {
        System.out.println("Dentro del método g");
    }

    void h() {
        System.out.println("Dentro del método h");
    }

    /*
    b) int suma(int x, int y)
    {
    int resultado;
     resultado = x + y;
    }
     */
    int suma(int x, int y) {
        int resultado;
        resultado = x + y;
        return resultado;
    }

    /*
    c) void f(float a);
    {
    float a;
     System.out.println(a);
    }
    */
    void f() {
        float a = (float) 1.0;
        System.out.println(a);
    }

    /*
    d) void producto()
    {
    int a = 6, b = 5, c = 4, resultado;
     resultado = a * b * c;
     System.out.printf(“El resultado es %d\n”, resultado);
    return resultado;
    }
    */
    int producto() {
        int a = 6, b = 5, c = 4, resultado;
        resultado = a * b * c;
        System.out.printf("El resultado es %d\n", resultado);
        return resultado;
    }
}
