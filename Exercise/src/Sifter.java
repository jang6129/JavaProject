import java.util.Scanner;

public class Sifter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean N[] = new boolean[Integer.parseInt(scan.nextLine())];

		if (N.length > 2) {
			N[0] = N[1] = false;

			for (int i = 2; i * i <= N.length; i += 1) {
				for (int k = 1; i * k < N.length; k++) {
					N[i * k] = false;
				}
			}

			N[2] = true;

			for (int i = 0; i < N.length; i++) {
				if (N[i] == true) {
					System.out.println(i);
				}
			}
		}
	}
}
