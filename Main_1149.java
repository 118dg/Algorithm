import java.util.Scanner;

public class Main_1149 {

	static int[][] arr = new int[1000][3];
	static int[][] ans = new int[1000][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		for (int i = 1; i <= n; i++) {
			MinValue(i);
		}

		System.out.println(min(ans[n][0], ans[n][1], ans[n][2]));

		s.close();

	}

	public static void MinValue(int i) {
		ans[i][0] = min(ans[i - 1][1], ans[i - 1][2]) + arr[i][0];
		ans[i][1] = min(ans[i - 1][0], ans[i - 1][2]) + arr[i][1];
		ans[i][2] = min(ans[i - 1][0], ans[i - 1][1]) + arr[i][2];
	}

	public static int min(int a, int b) {
		return (a > b) ? b : a;
	}

	public static int min(int a, int b, int c) {
		return min(a, min(b, c));
	}

}
