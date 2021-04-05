

import java.util.Scanner;

public class Main_9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int arr[] = new int[11];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		int test = s.nextInt();
		
		for(int i=0;i<test;i++) {
			int n = s.nextInt();
			for(int j=4;j<=n;j++) {
				arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
			}
			System.out.println(arr[n]);
		}
	}

}
