import java.lang.Math;
import java.util.Scanner;

public class Problem_1415 {
	
	//소수 판별 함수
	public static boolean prime (int num) { 
		if(num==1) return false;
		int flag = 0;
		for(int i=2; i<=Math.sqrt((double)num); i++) {
			if(num%i==0) {flag = 1; break;}
		}
		if(flag==1) return false;
		else return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("n=> ");
		n = s.nextInt();
		int[] price = new int[n];
		int priceLength = price.length;
		
		System.out.print("price=> ");
		for(int i=0; i<n; i++) {
			price[i] = s.nextInt();
		}
		
		int top = 0;
		int numOFsubset = (int)Math.pow((double)2,(double)n); //2^n.
		int[] sum = new int[numOFsubset];
		
		//모든 부분집합 구하기. & 그 각각의 부분집합 원소의 합 구하기.
		for(int i=0; i< (1<<n); i++) { 
			for(int j=0; j<n; j++) {
				if( (i&(1<<j))!=0 ) {
					sum[top] += price[j];
				}
			}
			top++;
		}
		
		//
		System.out.print("sum 값들=> ");
		for(int i=1; i<numOFsubset; i++) { //공집합은 제외, i=1부터 시작.
			System.out.printf("%d ",sum[i]);
		}
		System.out.println("");
		//
		
		//가격의 합이 소수인 것들 찾고 그 총 개수 구하기.
		int count=0;
		for(int i=1; i<numOFsubset; i++) { //공집합은 제외, i=1부터 시작.
			if( prime(sum[i]) ) {count++; System.out.printf("%d번째 sum 소수임.\n", i);} 
		}
		
		System.out.printf("count=> %d",count);
	}

}
