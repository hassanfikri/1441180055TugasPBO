public class TestATM {
    public static void main(String[] args) {
        Rekening aa = new Rekening(50000000.0);
        Nasabah bb = new Nasabah("Hasan","Fikri",aa);
        System.out.println(bb);
        bb.setAccount(aa);

        System.out.println(bb.toString());

        aa.tarik(3000000.00);

        System.out.println("tarik Rp. 3000000.00");
        System.out.println("tampilkan saldo sekarang = " + aa.getSaldo());

        aa.setor(3500000.00);

        System.out.println("setor Rp. 3500000.00");
        System.out.println("tampilkan saldo sekarang = " + aa.getSaldo());
    }
}
