package Unidad5;

public class OperadoresLogicos {
    public static void main(String[] args) {

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "AND condicional (&&)", "false && false", (false),
                "false && true", (false),
                "true && false", (false),
                "true && true", (true));

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "OR condicional (||)", "false || false", (false),
                "false || true", (true),
                "true || false", (true),
                "true || true", (true));

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "AND lógico booleano (&)", "false & false", (false),
                "false & true", (false),
                "true & false", (false),
                "true & true", (true));

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "OR inclusivo booleano (|)",
                "false | false", (false),
                "false | true", (true),
                "true | false", (true),
                "true | true", (true));


        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "OR exclusivo booleano (^)",
                "false ^ false", (false),
                "false ^ true", (true),
                "true ^ false", (true),
                "true ^ true", (false));

        System.out.printf("%s%n%s: %b%n%s: %b%n", "NOT lógico (!)",
                "!false", (true), "!true", (false));
    }
}