package org.example;

public class VersicherungsBerechner {

    public double berechneVersicherungsSumme(Versicherungsschutz produkt, double wohnflaeche) {
        if (wohnflaeche < 0) throw new IllegalArgumentException("Wohnfläche kannt nicht kleiner als 0 sein!");
        return wohnflaeche * produkt.getPreisPerQM();
    }
}
