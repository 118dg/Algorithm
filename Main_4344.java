import java.util.Scanner;

public class Main_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int C = s.nextInt();
		double result[] = new double[C];
		int top = 0;
		
		for (int t = 0; t < C; t++) {

			int N = s.nextInt();
			int score[] = new int[N];
			int sum = 0;

			for (int i = 0; i < N; i++) {
				score[i] = s.nextInt();
				sum += score[i];
			}

			int mean = sum / N, count = 0;
			for (int i = 0; i < N; i++) {
				if (score[i] > mean)
					count++;
			}
			result[top++] = (double) count / N * 100;
		}

		for (int i = 0; i < C; i++)
			System.out.printf("%.3f%%\n", result[i]);
	}

}
