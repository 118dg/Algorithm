import java.util.Scanner;

public class Problem_1316 {

	static char ch[] = new char[100]; //����
	static int top = 0;
	static void push(char e) { 
		ch[++top] = e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();

		int i, k, p, t, flag = 0, count = 0;
		String arr, line;

		line = s.nextLine(); //�Է� ���ۿ� ���� ���� ����
		for (t = 0; t < n; t++) { //�׽�Ʈ ����
			for (p = 0; p < 100; p++)
				ch[p] = '0'; // ch�迭 �ʱ�ȭ
			
			arr = s.nextLine();

			for (k = 0; k < arr.length(); k++) {
				for (i = 1 ; i < top ; i++) {
					if (ch[i] == arr.charAt(k)) { //���ÿ� ��ġ�°� �ֳ� üũ(���� ��ĭ ������ ������)
						flag = 1;
						break;
					}
				}
				if(flag==1) break;
				if (ch[top] != arr.charAt(k)) //�ٷ� ����ĭ ������ ���ÿ� �ȳְ� �ٸ��� ����
					push(arr.charAt(k));
			}
			
			if (flag == 0)
				count++;
			flag = 0;
			top = 0;
		}
		System.out.printf("%d", count);
		
		s.close();
	}
}
