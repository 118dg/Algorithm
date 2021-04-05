import java.util.Scanner;

public class Main_1120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String A = s.next();
		String B = s.next();
		int[] differ = new int[B.length()];
		int top = -1;

		if (A.length() < B.length()) {
			for (int i = 0; i <= B.length() - A.length(); i++) { // ���� ���� ��ŭ
				int count = 0;
				for (int j = 0; j < A.length(); j++) { // ���� ���� ����
					if (A.charAt(j) != B.charAt(j + i)) {
						count++;
					}
				}
				differ[++top] = count;
			}

			int min = differ[0];
			for (int i = 1; i <= B.length() - A.length(); i++) {
				if (min > differ[i])
					min = differ[i];
			}
			System.out.println(min);
			
		} else { // ���� ���� ��
			int count = 0;
			for (int j = 0; j < A.length(); j++) { // ���� ���� ����
				if (A.charAt(j) != B.charAt(j)) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
