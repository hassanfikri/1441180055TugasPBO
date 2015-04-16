class testMobil {
	public static void main(String[] args) {
		mobil hasan = new mobil();

		System.out.println("merk		=" +hasan.getmerk());
		System.out.println("platNomor	=" +hasan.getplatNomor());
		System.out.println("warna 		=" +hasan.getwarna());
		System.out.println("mesin		=" +hasan.getmesin() +"cc");
		System.out.println("kecepatan	=" +hasan.getkecepatan() +"km");
		hasan.maju();
		System.out.println(" ");	

	 mobil bagus = new mobil("Fortuner","B4GUS");

		System.out.println("merk		=" +bagus.getmerk());
		System.out.println("platNomor	=" +bagus.getplatNomor());
		bagus.mundur();
		System.out.println(" ");


	mobil yusuf = new mobil("Avanza","N1045AD","Putih");

		System.out.println("merk		=" +yusuf.getmerk());
		System.out.println("platNomor 	=" +yusuf.getplatNomor());
		System.out.println("warna  		=" +yusuf.getwarna());
		yusuf.berhenti();
		System.out.println(" ");


	mobil fikri = new mobil("Velfire","N1234HF","Hitam",3000);

		System.out.println("merk		=" +fikri.getmerk());
		System.out.println("platNomor 	=" +fikri.getplatNomor());
		System.out.println("warna  		=" +fikri.getwarna());
		System.out.println("mesin   	=" +fikri.getmesin() +"cc");
		fikri.belok();
		System.out.println(" ");

	mobil indra = new mobil("Jazz","B4556BE","Merah",1500,120);

		System.out.println("merk		=" +indra.getmerk());
		System.out.println("platNomor 	=" +indra.getplatNomor());
		System.out.println("warna  		=" +indra.getwarna());
		System.out.println("mesin   	=" +indra.getmesin() +"cc");
		System.out.println("kecepatan	=" +indra.getkecepatan() +"km"); 
		indra.ngebut();
		System.out.println(" ");
	

	
}
}