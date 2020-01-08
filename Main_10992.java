
import java.util.Scanner;

public class Main_10992 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		for (int i = 0; i < N - 1; i++) {
			
			for (int j = 0; j < N - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for (int k = 0; k < i * 2 - 1; k++) {
				System.out.print(" ");
			}
			if (i != 0)
				System.out.print("*");

			System.out.println();
		}
		for (int i = 0; i < 2 * N - 1; i++) {
			System.out.print("*");
		}
	}

}
