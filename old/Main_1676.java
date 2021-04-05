import java.util.Scanner;

public class Main_1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int count2 = 0, count5 = 0;

		for (int i = n; i > 0 ; i--) {
			int temp = i;
			while (temp % 2 == 0) {
				temp /= 2; count2++; 
			}
			while (temp % 5 == 0) {
				temp /= 5; count5++; 
			}
		}
		
		int min = (count2>count5) ? count5 : count2;
		System.out.println(min);
	}

}
