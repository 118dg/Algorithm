### 틀린 풀이. 그러나 왜 틀렸는지 모르겠다.
	
import java.util.Scanner;

public class Main_1158 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//      StringBuilder answer = new StringBuilder();

		Scanner sc = new Scanner(System.in);

//		int total = Integer.parseInt(br.readLine());
//		int n = Integer.parseInt(br.readLine());
		int total = sc.nextInt();
		int n = sc.nextInt();

		int index = n;
		int count = 0;
		int print = 0;

		int[] numArr = new int[total + 10];
		for (int i = 1; i <= total; i++) {
			numArr[i - 1] = i;
		}

		// answer.append("<" + numArr[n - 1] + ", "); //첫 번째 숫자
		System.out.print("<" + numArr[n - 1] + ", ");
		print++;
		numArr[n - 1] = 0;

		while (print != total && -1 < index && index < total) { // 모든 숫자 출력될 때까지

			if (numArr[index] != 0) {
				count++;
			}

			if (count == n) { // n번째 꺼마다 숫자 출력
				count = 0;
				if (print == total - 1) {
					// answer.append(numArr[index] + ">"); //마지막 숫자
					System.out.print(numArr[index] + ">");
					print++;
					numArr[index] = 0; // 쓴 숫자는 없애기
				} else {
					// answer.append(numArr[index] + ", ");
					System.out.print(numArr[index] + ", ");
					print++;
					numArr[index] = 0; // 쓴 숫자는 없애기
				}
			}

			index++;
			if (index % total == 0)
				index = 0; // 인덱스 배열 끝 도달시 처음으로
		}

		// bw.write(answer.toString() + "\n");
		// bw.flush();
		// bw.close();
		// br.close();
	}

}
