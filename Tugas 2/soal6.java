public class soal6{
	public static void main(String[] args) {
		int angka = 0;
		int jumlah = 0;

		while (angka < 10) {
			angka++;
			jumlah += angka;
		}
		System.out.print(" " +jumlah);
	}
}