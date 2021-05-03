import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_9012 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {

			sb.append(solve(br.readLine())).append("\n");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	public static String solve(String str) {
		Stack<Character> stack = new Stack<Character>();

		boolean failed = false;

		for (int j = 0; j < str.length(); j++) {

			char c = str.charAt(j);

			if (c == '(') {
				stack.push(c);
			} 
			else if (stack.empty()) {
				return "NO";
			} 
			else {
				stack.pop();
			}
		}

		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}

}
