public class soal7{
	public static void main(String[] args) {
		float jumlah = 0;
		int angka = 0;

		while (angka < 10) {
			angka++;
			jumlah += angka;
		}
		System.out.println(" " +jumlah/angka);
	}
}