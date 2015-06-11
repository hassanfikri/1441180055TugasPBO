package com.hasan.project;

public class TestPemilik {

    public static void main(String[] args) {

        Pemilik Hasan = new Pemilik("Hasan","plaosan permai",'L',20);
        System.out.println(Hasan.getNamaPemilik());
        System.out.println(Hasan.getAlamatPemilik());
        System.out.println(Hasan.getJenisKelaminPemilik());
        System.out.println(Hasan.getUmurPemilik());

        Helm INK = new Helm("INK","Putih","Fullface",'M',700.000);
        System.out.println(INK.getMerkHelm());
        System.out.println(INK.getWarnaHelm());
        System.out.println(INK.getTipeHelm());
        System.out.println(INK.getUkuranHelm());
        System.out.println(INK.getHargaHelm());
    }
}
