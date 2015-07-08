package UAS;

/**
 * Created by user on 7/8/2015.
 */
public class TestLiga {

    public static void main(String[] args) {

        Liga italy = new Liga("italy");

        Divisi seriA  = new Divisi("seriA");
        Divisi seriB = new Divisi("seriB");

        Klub seriB1 = new Klub("catania",seriB,italy);
        Klub seriB2 = new Klub("bologna",seriB, italy);
        Klub seriA1 = new Klub("inter milan",seriA,italy);
        Klub seriA2 = new Klub("ac milan",seriA, italy);

        italy.setDaftarDivisi(seriA);
        italy.setDaftarDivisi(seriB);

        italy.setDaftarKlub(seriB1);
        italy.setDaftarKlub(seriB2);
        italy.setDaftarKlub(seriA1);
        italy.setDaftarKlub(seriA2);

        seriB.setDaftarKlub(seriB1);
        seriB.setDaftarKlub(seriB2);
        seriA.setDaftarKlub(seriA1);
        seriA.setDaftarKlub(seriA2);

        System.out.println("Liga : " +italy.getNamaLiga());
        System.out.println("Divisi : " +italy.getDaftarDivisi());

        System.out.println("\n");

        System.out.println("1");
        System.out.println("Liga : " +italy.getNamaLiga());
        System.out.println("Klub : " +italy.getDaftarKlub());
        System.out.println("\n");
        System.out.println("Liga : " +italy.getNamaLiga());
        System.out.println("Klub : " +seriB.getDaftarKlub());
        System.out.println("\n");
        System.out.println("Liga : " +italy.getNamaLiga());
        System.out.println("Klub : " + seriA.getDaftarKlub());
        System.out.println("\n");
        System.out.println("Liga : " +seriB1.getLiga());
        System.out.println("Klub : " +seriB1.getNamaKlub());
        System.out.println("Divisi : " + seriB1.getDivisi());
        System.out.println("\n");
        System.out.println("Liga : " +seriB2.getLiga());
        System.out.println("Klub : " +seriB2.getNamaKlub());
        System.out.println("Divisi : " +seriB2.getDivisi());
        System.out.println("\n");
        System.out.println("Liga : " + seriA1.getLiga());
        System.out.println("Klub : " + seriA1.getNamaKlub());
        System.out.println("Divisi : " + seriA1.getDivisi());
        System.out.println("\n");
        System.out.println("Liga : " + seriA2.getLiga());
        System.out.println("Klub : " + seriA2.getNamaKlub());
        System.out.println("Divisi : " + seriA2.getDivisi());
        System.out.println("\n");
    }

}
