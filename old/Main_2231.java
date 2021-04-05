import java.util.Scanner;

public class Main_2231{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int flag = 0;

		for (int i = 1; i < N; i++) {
			if (getNum(i) == N) {
				System.out.println(i);
				flag = 1;
			}
			if(flag == 1) break;
		}

		if (flag == 0)
			System.out.println("0");
	}

	public static int getNum(int i) {
		if (i >= 10) {
			int result = i, temp = i;
			int m = 1000000;
			while (m >= 10) {
				result += temp / m;
				temp %= m;
				m /= 10;
			}
			result += temp;
			return result;
		} else //한 자리 수인 경우
			return i+i; // ex) 1의 분해합은 2
	}
}
