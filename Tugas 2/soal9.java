public class soal9{
	public static void main(String[] args) {
		for (int a = 1; a < 111 ; a++) {
			if (a % 5 == 0) {
				System.out.print("JONI");
			}
			else {
				System.out.println(a+ " ");
			}
			if (a % 11 == 0) {
				System.out.println(" ");
			}
		}
	}
}