package com.hasan.project;

public class Helm {

    private String merkHelm;
    private String warnaHelm;
    private String tipeHelm;
    private char ukuranHelm;
    private Double hargaHelm;

    public Helm() {
    }

    public Helm(String merkHelm, String warnaHelm, String tipeHelm, char ukuranHelm, Double hargaHelm) {
        this.merkHelm = merkHelm;
        this.warnaHelm = warnaHelm;
        this.tipeHelm = tipeHelm;
        this.ukuranHelm = ukuranHelm;
        this.hargaHelm = hargaHelm;
    }

    public String getMerkHelm() {
        return merkHelm;
    }

    public void setMerkHelm(String merkHelm) {
        this.merkHelm = merkHelm;
    }

    public String getWarnaHelm() {
        return warnaHelm;
    }

    public void setWarnaHelm(String warnaHelm) {
        this.warnaHelm = warnaHelm;
    }

    public String getTipeHelm() {
        return tipeHelm;
    }

    public void setTipeHelm(String tipeHelm) {
        this.tipeHelm = tipeHelm;
    }

    public char getUkuranHelm() {
        return ukuranHelm;
    }

    public void setUkuranHelm(char ukuranHelm) {
        this.ukuranHelm = ukuranHelm;
    }

    public Double getHargaHelm() {
        return hargaHelm;
    }

    public void setHargaHelm(Double hargaHelm) {
        this.hargaHelm = hargaHelm;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "merkHelm='" + merkHelm + '\'' +
                ", warnaHelm='" + warnaHelm + '\'' +
                ", tipeHelm='" + tipeHelm + '\'' +
                ", ukuranHelm=" + ukuranHelm +
                ", hargaHelm=" + hargaHelm +
                '}';
    }
}
