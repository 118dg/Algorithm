import java.util.*;

public class Main_1431_wrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		String[] str = new String[n];
		String[] result = new String[n];

		// �Է¹ޱ�
		for (int i = 0; i < n; i++) {
			str[i] = s.next();
		}

		Arrays.sort(str);

		// ���� ª���� ������
		int top = 0;
		for (int len_short = 1; len_short < 50; len_short++) {
			for (int i = 0; i < n; i++) {
				if (str[i].length() == len_short) {
					result[top++] = str[i];
				}
			}
		}

		// Ȯ��
		System.out.println("length sort right? : ");
		for (int i = 0; i < n; i++) {
			System.out.println(result[i]);
		}
		System.out.println();

		// �� ���ϱ�
		int[] sum_list = new int[n];
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < str[i].length(); j++) {
				if (('1' <= str[i].charAt(j)) && (str[i].charAt(j) <= '9')) {
					sum += str[i].charAt(j) - '0';
				}
			}
			sum_list[i] = sum;
		}

		//sum list Ȯ��
		System.out.println("sum list :");
		for (int i = 0; i < n; i++) {
			System.out.print(sum_list[i]);
			System.out.print(" ");
		}
		System.out.println();

		//�� �׸��� ���� ���̵� ����ؼ� ����� ����..��.. (��ġ��!)
		// �� ū�� �ڷ�
		int max = 0, max_index = -1;
		for (int i = 0; i < n; n--) {
			for (int j = 0; j < n; j++) {
				if (max < sum_list[j]) {
					max = sum_list[j];
					max_index = j;
				}
			}
			String temp = result[max_index];
			for (int j = n - 1; j > max_index; j--) {
				result[j - 1] = result[j];
			}
			result[n - 1 - i] = temp;
		}

		// ���
		System.out.println("answer :");
		for (int i = 0; i < n; i++) {
			System.out.println(result[i]);
		}
		System.out.println();
		System.out.println("��?");

	}

}
