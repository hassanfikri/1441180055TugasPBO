public class soal11{
	public static void main(String[] args) {
		int panjang = 5;
		int lebar = 6;

		for (int a = 1; a <= panjang ; a++) {
			if (a % 2 == 0) {
				System.out.print(" #");
			}
			for (int b = 1; b <= lebar ; b++) {
				System.out.print("#");
			}
			System.out.println(" ");
		}
	}
}