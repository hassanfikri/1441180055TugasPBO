class testLaptop {
	public static void main(String[] args) {
		laptop thosiba = new laptop();

		System.out.println("warna=" +thosiba.getwarna());
		System.out.println("merk=" +thosiba.getmerk());
		System.out.println("wifi=" +thosiba.getwifi());
		System.out.println("batrai=" +thosiba.getbaterai());
		System.out.println(" ");



laptop acer = new laptop("Acer","Ungu");

		System.out.println("warna=" +acer.getwarna());
		System.out.println("merk=" +acer.getmerk());

		System.out.println(" ");



	laptop dell = new laptop("dell","Ijo","Koneksi");

		System.out.println("warna=" +dell.getwarna());
		System.out.println("merk=" +dell.getmerk());
		System.out.println("wifi=" +dell.getwifi());
		
		System.out.println("");



laptop hp = new laptop("hp","Merah","Tak KOneksi",70);

		System.out.println("warna=" +hp.getwarna());
		System.out.println("merk=" +hp.getmerk());
		System.out.println("wifi=" +hp.getwifi());
		System.out.println("batrai=" +hp.getbaterai());
		System.out.println(" ");
	







	}

}