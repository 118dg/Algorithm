import java.util.Scanner;

public class Problem_1316 {

	static char ch[] = new char[100]; //스택
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

		line = s.nextLine(); //입력 버퍼에 남은 엔터 제거
		for (t = 0; t < n; t++) { //테스트 개수
			for (p = 0; p < 100; p++)
				ch[p] = '0'; // ch배열 초기화
			
			arr = s.nextLine();

			for (k = 0; k < arr.length(); k++) {
				for (i = 1 ; i < top ; i++) {
					if (ch[i] == arr.charAt(k)) { //스택에 겹치는거 있나 체크(왼쪽 두칸 떨어진 곳까지)
						flag = 1;
						break;
					}
				}
				if(flag==1) break;
				if (ch[top] != arr.charAt(k)) //바로 왼쪽칸 같으면 스택에 안넣고 다르면 넣음
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
