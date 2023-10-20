/*
3.17 (Computarización de los registros médicos) Un tema relacionado con la salud que ha estado últimamente
en las noticias es la computarización de los registros médicos. Esta posibilidad se está tratando con mucho cuidado,
debido a las delicadas cuestiones de privacidad y seguridad, entre otras cosas. [Trataremos esas cuestiones en ejercicios
posteriores]. La computarización de los registros médicos puede facilitar a los pacientes el proceso de compartir sus
perfiles e historiales médicos con los diversos profesionales de la salud que consulten. Esto podría mejorar la calidad
del servicio médico, ayudar a evitar conflictos de fármacos y prescripciones erróneas, reducir los costos y, en
emergencias, podría ayudar a salvar vidas. En este ejercicio usted diseñará una clase “inicial” llamada PerfilMedico para
una persona. Los atributos de la clase deben incluir el primer nombre de la persona, su apellido, sexo, fecha de nacimiento
(que debe consistir de atributos separados para el día, mes y año de nacimiento), altura (en centímetros) y peso (en
kilogramos). Su clase debe tener un constructor que reciba estos datos. Para cada atributo, debe proveer los métodos
establecer y obtener. La clase también debe incluir métodos que calculen y devuelvan la edad del usuario en años, la
frecuencia cardiaca máxima y el rango de frecuencia cardiaca esperada (vea el ejercicio 3.16), además del índice de masa
corporal (BMI; vea el ejercicio 2.33). Escriba una aplicación de Java que pida la información de la persona, cree una
instancia de un objeto de la clase PerfilMedico para esa persona e imprima la información de ese objeto (incluyendo
el primer nombre de la persona, apellido, sexo, fecha de nacimiento, altura y peso), y que después calcule e imprima
la edad de esa persona en años, junto con el BMI, la frecuencia cardiaca máxima y el rango de frecuencia cardiaca esperada.
También debe mostrar la tabla de valores del BMI del ejercicio 2.33.
 */

package ejercicios.capitulo3;

public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int day;
    private int month;
    private int year;
    private double altura;
    private double peso;

    public PerfilMedico(String primerNombre, String apellido, String sexo, int day, int month, int year, double altura,
                        double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.day = day;
        this.month = month;
        this.year = year;
        this.altura = altura;
        this.peso = peso;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularEdad() {
        return 2023 - year;
    }

    public int calcularFrecuenciaCardiacaMaxima() {
        return 220 - calcularEdad();
    }

    public double calcularFrecuenciaCardiacaMinimaEsperada() {
        return calcularFrecuenciaCardiacaMaxima() * 0.5;
    }

    public double calcularFrecuenciaCardiacaMaximaEsperada() {
        return calcularFrecuenciaCardiacaMaxima() * 0.85;
    }

    public double calcularIndiceDeMasaCorporal() {
        return peso / (altura * altura);
    }

    public void mostrarValoresDeReferenciaBMI() {
        System.out.println("VALORES DE BMI");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");
    }
}