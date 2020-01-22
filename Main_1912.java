import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main_1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] num = new int[n];
		int[] d = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt();
			d[i] = 0;
		}

		int result = -1000;

		d[0] = num[0];
		for (int i = 1; i < n; i++) {
			d[i] = max(d[i - 1] + num[i], num[i]);
			result = max(result, d[i]);
		}
		result = max(result,d[0]);
		
		System.out.println(result);
	}

	public static int max(int i, int j) {
		// TODO Auto-generated method stub
		return (i > j) ? i : j;
	}

}
