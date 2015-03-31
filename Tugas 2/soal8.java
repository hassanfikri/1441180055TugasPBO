public class soal8{
	public static void main(String[] args) {
		for (int angka = 1; angka < 111 ; angka++) {
			System.out.print(" " +angka);

			if (angka % 11 == 0) {
				System.out.println(" ");
			}
		}
	}
}