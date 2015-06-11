package com.hasan.project;

public class Pemilik {
    private String namaPemilik;
    private String alamatPemilik;
    private char jenisKelaminPemilik;
    private int umurPemilik;

    public Pemilik() {
    }

    public Pemilik(String namaPemilik, String alamatPemilik, char jenisKelaminPemilik, int umurPemilik) {
        this.namaPemilik = namaPemilik;
        this.alamatPemilik = alamatPemilik;
        this.jenisKelaminPemilik = jenisKelaminPemilik;
        this.umurPemilik = umurPemilik;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getAlamatPemilik() {
        return alamatPemilik;
    }

    public void setAlamatPemilik(String alamatPemilik) {
        this.alamatPemilik = alamatPemilik;
    }

    public char getJenisKelaminPemilik() {
        return jenisKelaminPemilik;
    }

    public void setJenisKelaminPemilik(char jenisKelaminPemilik) {
        this.jenisKelaminPemilik = jenisKelaminPemilik;
    }

    public int getUmurPemilik() {
        return umurPemilik;
    }

    public void setUmurPemilik(int umurPemilik) {
        this.umurPemilik = umurPemilik;
    }

    @Override
    public String toString() {
        return "Pemilik{" +
                "namaPemilik='" + namaPemilik + '\'' +
                ", alamatPemilik='" + alamatPemilik + '\'' +
                ", jenisKelaminPemilik=" + jenisKelaminPemilik +
                ", umurPemilik=" + umurPemilik +
                '}';
    }
}
