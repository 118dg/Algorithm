import java.util.Scanner;

public class Problem_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
			sum+=arr[i];
		}
		
		int max = arr[0];
		int num = 0;
		for(int i=1;i<n;i++) {
			if(max<arr[i]) {max = arr[i]; num=i;}
		}
		System.out.printf("%f",sum/(float)max*100/n);
	}

}
