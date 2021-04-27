import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
 
class Top { // ž�� ���� ����
    int num; // ž�� ��ȣ
    int height; // ž�� ����
 
    Top(int num, int height) {
        this.num = num;
        this.height = height;
    }
}
 
public class Main_2493 {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
 
        Stack<Top> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int height = Integer.parseInt(st.nextToken());
 
            if (stack.isEmpty()) { // ������ ����ִٸ�, 0�� ����ϰ� ž�� push�Ѵ�. (�ʱ� ������ ����.)
                answer.append("0 ");
                stack.push(new Top(i, height));
            } else {
                while (true) { 
                    if (stack.isEmpty()) { // ������ ����ִٸ�, 0�� ����ϰ� ž�� push�Ѵ�.
                        answer.append("0 ");
                        stack.push(new Top(i, height));
                        break;
                    }
 
                    Top top = stack.peek();
 
                    if (top.height > height) { // peek�� ž�� ���̰� ���� ž�� ���̺��� ���ٸ�,
                        answer.append(top.num + " "); // peek�� ž�� ��ȣ�� ����ϰ�,
                        stack.push(new Top(i, height)); // ���� ž�� ���ÿ� push�Ѵ�.
                        break;
                    } else { // peek�� ž�� ���̰� ���� ž�� ���̺��� ���ٸ�,
                        stack.pop(); // ���ÿ��� pop�ϰ� �ٽ� �ݺ����� ������.
                    }
                }
            }
        }
 
        bw.write(answer.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
}