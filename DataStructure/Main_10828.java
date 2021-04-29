import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_10828 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());

		Stack<Integer> stack = new Stack<Integer>();

		String command;
		int num = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			command = st.nextToken();
			if (st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
			}

			switch (command) {
			case "push":
				stack.push(num);
				break;

			case "pop":
				if (stack.empty())
					sb.append(-1 + "\n");
				else
					sb.append(stack.pop() + "\n");
				break;

			case "size":
				sb.append(stack.size() + "\n");
				break;

			case "empty":
				if (stack.empty())
					sb.append(1 + "\n");
				else
					sb.append(0 + "\n");
				break;

			case "top":
				if (stack.empty())
					sb.append(-1 + "\n");
				else
					sb.append(stack.peek() + "\n");
				break;
			}
		}

		bw.write(sb.toString() + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
