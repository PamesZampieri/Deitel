package ejercicios.capitulo3;

public class FrecuenciasCardiacas {
    private String primerNombre;
    private String apellido;
    private int day;
    private int month;
    private int year;

    public FrecuenciasCardiacas(String primerNombre, String apellido, int day, int month, int year) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellido() {
        return apellido;
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

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
}
