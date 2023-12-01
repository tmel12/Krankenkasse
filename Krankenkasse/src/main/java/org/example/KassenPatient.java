package org.example;

public class KassenPatient {
    private int patientenNr;
    private String patientenName;
    private String adresse;
    private String geburtsdatum;
    private String versichertenName;
    private boolean versichertenKarteVorgelegt;
    private Krankenkasse krankenkasse;

    public KassenPatient(int patientenNr, String patientenName, String adresse,
                         String geburtsdatum, Krankenkasse krankenkasse) {
        this.patientenNr = patientenNr;
        this.patientenName = patientenName;
        this.adresse = adresse;
        this.geburtsdatum = geburtsdatum;
        this.versichertenName = patientenName; // vorbelegt mit Patientenname
        this.versichertenKarteVorgelegt = true; // initialisiert mit „ja“
        this.krankenkasse = krankenkasse;
    }

    public String toString() {
        return "Patienten-Nr.: " + patientenNr + ", Name: " + patientenName +
                ", Adresse: " + adresse + ", Geburtsdatum: " + geburtsdatum +
                ", Versichert bei: " + krankenkasse.getKassenname();
    }

}
