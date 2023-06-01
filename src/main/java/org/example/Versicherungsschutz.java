package org.example;

public enum Versicherungsschutz {
    OPTIMAL(700),
    KOMPAKT(650);

    private final int preisPerQM;

    Versicherungsschutz(int preisPerQM) {
        this.preisPerQM = preisPerQM;
    }

    public int getPreisPerQM() {
        return preisPerQM;
    }
}
