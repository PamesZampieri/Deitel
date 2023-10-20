/*
6.5 Encuentre el error en cada uno de los siguientes segmentos de programas. Explique cómo se puede corregir.
*/

package ejercicios.capitulo6;

public class ejercicio_6_5 {
    public static void main(String[] args) {
        g(); //a
        h();
        System.out.printf("El resultado de la suma de 890 + 450 es = %d%n", suma(890, 450));//b
        f(5);//c
        producto();//d

    }

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
    public static void g() {
        System.out.println("Dentro del método g.");
    }

    public static void h() {
        System.out.println("Dentro del método h.");
    }

    /*
    b) int suma(int x, int y)
    {
    int resultado;
     resultado = x + y;
    }
     */
    public static int suma(int x, int y) {
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
    public static void f(float a) {
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
    public static int producto() {
        int a = 6, b = 5, c = 4, resultado;
        resultado = a * b * c;
        System.out.printf("El resultado es %d\n", resultado);
        return resultado;
    }
}