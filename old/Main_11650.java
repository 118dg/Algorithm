import java.util.Scanner;

public class Main_11650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x[] = new int[100000];
		int xAns[] = new int[100000];
		int y[] = new int[100000];
		int yAns[] = new int[100000];
		int indexArr[] = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = s.nextInt();
			y[i] = s.nextInt();
		}

		int check = 0, temp, min, index = 0;
		for (int i = 0; i < n - 1; i++) {
			min = x[i];
			for (int j = i + 1; j < n; j++) {
				if (min > x[j]) {
					min = x[j];
					index = j;
					check = 1;
				} else if (min == x[j]) {
					if (y[index] > y[j]) {
						index = j;
						min = x[index];
						check = 1;
					}
				}
			}
			if (check == 1) {
				temp = x[i];
				x[i] = x[index];
				x[index] = temp;
				temp = y[i];
				y[i] = y[index];
				y[index] = temp;
			}
			check = 0;
		}

		for (int i = 0; i < n; i++) {
			System.out.printf("%d %d\n", x[i], y[i]);
		}
	}
}
