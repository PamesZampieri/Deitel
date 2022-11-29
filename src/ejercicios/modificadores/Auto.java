package ejercicios.modificadores;

public class Auto extends Vehiculo {
    private int nivelAceite;
    private int nroDeSerie;
    public static int nroDeSerieActual = 1;

    public Auto(int nivelAceite) {
        this.nivelAceite = nivelAceite;
        nroDeSerie = Auto.nroDeSerieActual++;
    }

    public int getNivelAceite() {
        return nivelAceite;
    }

    public void setNivelAceite(int nivelAceite) {
        this.nivelAceite = nivelAceite;
    }

    public int getNroDeSerie() {
        return nroDeSerie;
    }

    public void setNroDeSerie(int nroDeSerie) {
        this.nroDeSerie = nroDeSerie;
    }

    public void andar() {
        System.out.println("Ran, ran, ran");
    }

    public void encender() {
        System.out.println("Auto encendido!!!");
    }
}
