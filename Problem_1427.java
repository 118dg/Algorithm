import java.util.Scanner;

public class Problem_1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		long arr[] = new long [10];
		int i, j, num, top=1, flag=0;
		long n, r;
		n = s.nextLong();
		
		for(i=0;i<10;i++) arr[i]=0;
		
		arr[0] = n%10;
		n /= 10;
		
		while(n!=0) {
			r = n%10;
			num = top;
			for(i=0;i<num;i++) {
				if(r<=arr[i]) {
					flag=1;
					for(j=num;j>i;j--) arr[j]=arr[j-1];
					arr[i] = r; top++;
					break;
				}
			}
			if(flag==0) arr[top++] = r;
			n /= 10;
			flag=0;
		}
		
		for(i=top-1;i>=0;i--) System.out.printf("%d",arr[i]);
		//내림차순으로 정렬하는건데 잘못보고 오름차순으로 풀어버려서 출력만 반대로 바꿨어요 ㅋㅋ
		
		s.close();
	}

}
