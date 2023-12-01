package org.example;

public class ZahnarztpraxisApp {
    public static void main(String[] args) {
        // Erstellen von Krankenkassen
        Krankenkasse kasse1 = new Krankenkasse(1001, "Krankenkasse A");
        Krankenkasse kasse2 = new Krankenkasse(1002, "Krankenkasse B");

        // Erstellen von Kassenpatienten
        KassenPatient patient1 = new KassenPatient(1, "Max Mustermann",
                "Musterstraße 1", "01.01.1990", kasse1);
        KassenPatient patient2 = new KassenPatient(2, "Erika Mustermann",
                "Musterstraße 2", "02.02.1990", kasse2);

        // Hinzufügen der Patienten zu den jeweiligen Krankenkassen
        kasse1.addPatient(patient1);
        kasse2.addPatient(patient2);

        // Ausgabe der Patienteninformationen
        System.out.println("Patienten von " + kasse1.getKassenname() + ":");
        for (KassenPatient patient : kasse1.getPatienten()) {
            System.out.println(patient);
        }

        System.out.println("\nPatienten von " + kasse2.getKassenname() + ":");
        for (KassenPatient patient : kasse2.getPatienten()) {
            System.out.println(patient);
        }


    }
}

