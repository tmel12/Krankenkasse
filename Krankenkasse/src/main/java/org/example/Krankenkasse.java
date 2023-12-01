package org.example;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Krankenkasse {
    private int kassennummer;
    private String kassenname;
    private List<KassenPatient> patienten;

    public Krankenkasse(int kassennummer, String kassenname) {
        this.kassennummer = kassennummer;
        this.kassenname = kassenname;
        this.patienten = new ArrayList<>();
    }

    public void addPatient(KassenPatient patient) {
        this.patienten.add(patient);
    }

    public String getKassenname() {
        return kassenname;
    }

    public List<KassenPatient> getPatienten() {
        return patienten;
    }


}
