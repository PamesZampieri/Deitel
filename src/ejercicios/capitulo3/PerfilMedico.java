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
        return 2022 - year;
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
