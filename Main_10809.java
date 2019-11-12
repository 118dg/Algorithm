import java.util.Scanner;

public class Main_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int flag = 0;

		String str = s.next();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					System.out.print(i + " ");
					flag = 1;
					break;
				}
			}
			if (flag == 0) System.out.print("-1 ");
			flag = 0;
		}
	}
}
