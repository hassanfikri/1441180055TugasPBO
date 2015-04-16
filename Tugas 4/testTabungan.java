class testTabungan {
	public static void main(String[] args) {
		tabungan hasan = new tabungan();

		System.out.println("simpanan 	=" +hasan.setsimpanan());
		System.out.println("pemilikRek 	=" +hasan.setpemilikRek());
		System.out.println("noRek 		=" +hasan.getnoRekening());
		System.out.println("bunga 		=" +hasan.getbunga());
		hasan.menabung();
		System.out.println(" ");




tabungan bagus = new tabungan("BagusPurnomo","BRI");

		System.out.println("simpanan 	=" +bagus.setsimpanan());
		System.out.println("pemilikRek 	=" +bagus.setpemilikRek());
		bagus.mengambil();
		System.out.println(" ");



tabungan andre = new tabungan("Andreas","BNI",1441180005);
		
		System.out.println("simpanan 	=" +andre.setsimpanan());
		System.out.println("pemilikRek 	=" +andre.setpemilikRek());
		System.out.println("noRek 		=" +andre.getnoRekening());
		andre.transfer();
		System.out.println("");



tabungan reza = new tabungan("Fachreza","Mandiri",1441180657,50);

		System.out.println("simpanan 	=" +reza.setsimpanan());
		System.out.println("pemilikRek 	=" +reza.setpemilikRek());
		System.out.println("noRek 		=" +reza.getnoRekening());
		System.out.println("bunga 		=" +reza.getbunga());
		reza.menerimaTransfer();
		System.out.println(" ");
	





	}

}