import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1158 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        StringBuilder answer = new StringBuilder();
		
		int total = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int tempIndex = n - 1;
		int print = 0;

		int[] numArr = new int[total];
		for (int i = 1; i <= total; i++) {
			numArr[i - 1] = i;
		}

		answer.append("<" + numArr[n - 1] + ", ");
		print++;
		
		while(print != n-1) {
			for (int count = n; count > 0;) {
				if ((tempIndex + 1) % total == 0) { // 끝에 도달하면
					tempIndex = 0;
				}

				if (!(numArr[tempIndex] == 0)) {
					count--;
				}
				tempIndex++;
			}
			answer.append(numArr[tempIndex]+ ", ");
			numArr[tempIndex] = 0;
		}

        bw.write(answer.toString() + "\n");
        bw.flush();
        bw.close();
		br.close();
	}

}
