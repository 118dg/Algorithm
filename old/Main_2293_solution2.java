import java.util.Scanner;

public class Main_2293_solution2 {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int k = s.nextInt();
		int[] coin = new int[n + 1];
		int[] d = new int[k + 1];

		for (int i = 1; i <= n; i++) {
			coin[i] = s.nextInt();
		}

		d[0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				if (j >= coin[i])
					d[j] += d[j - coin[i]];
			}
		}
		
		System.out.println(d[k]);

	}
}
