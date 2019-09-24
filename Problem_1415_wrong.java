package test;

import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Problem_1415_wrong {

	static int check = 0;

	// �Ҽ� �Ǻ� �Լ�
	public static boolean prime(int num) {
		if (num == 0 || num == 1)
			return false;
		else {
			int flag = 0;
			for (int i = 2; i <= Math.sqrt((double) num); i++) {
				if (num % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 1)
				return false;
			else
				return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("n=> ");
		n = s.nextInt();
		int[] price = new int[n];

		System.out.print("price=> ");
		for (int i = 0; i < n; i++) {
			price[i] = s.nextInt();
		}

		Arrays.sort(price);

		int top = 0;
		int numOFsubset = 1 << n; // �κ������� ����.
		// �κ������� ���� 2^n ���ϴ� �ٸ� ���. int numOFsubset = (int)Math.pow((double)2,(double)n);

		int[] sum = new int[numOFsubset];

		// ��� �κ����� ���ϱ�. & �� ������ �κ����� ������ �� ���ϱ�.
		myLabel: for (int i = 0; i < (1 << n); i++) {
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					// ���� ���� ���, �� ���� ���� ���� ���Ұ� �κ����տ� ���� ���� �� i���� �ƿ� ����.
					for (int k = 1; k <= j; k++)
						if (price[j] == price[j - k])
							if ((i & (1 << (j - k))) == 0)
								continue myLabel;
					sum[top] += price[j];
					System.out.printf("Ȯ��%d : i=%d j=%d sum[%d]=%d\n", check++, i, j, top, sum[top]);
				}
			}
			top++;
		}

		// ������ ���� �Ҽ��� �͵� ã�� �� �� ���� ���ϱ�.
		int count = 0;
		for (int i = 1; i < numOFsubset; i++) { // �������� ����, i=1���� ����.
			if (prime(sum[i])) {
				count++;
			}
		}

		System.out.printf("count=> %d", count);
	}

}
