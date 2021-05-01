import java.util.Scanner;

public class Main_2493 { //첫 도전, 시간 초과
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] arr = new int[num];
		arr[0] = sc.nextInt();

		boolean flag;
		
		System.out.print(0 + " ");
		
		for (int i = 1; i < num; i++) {
			flag = false;
			int now = sc.nextInt();

			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > now) {
					System.out.print(j + 1 + " ");
					flag = true;
					break;
				}
			}
			if (!flag)
				System.out.print(0 + " ");
			arr[i] = now;
		}
	}
}
