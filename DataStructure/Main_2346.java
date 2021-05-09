import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
N개의 풍선이 있다. 각 풍선 안에는 -N부터 N까지의 수가 적혀있는 종이가 들어 있다. 
이 풍선들을 다음과 같은 규칙으로 터뜨린다.

우선, 제일 처음에는 1번 풍선을 터뜨린다. 
다음에는 풍선 안에 있는 종이를 꺼내어 그 종이에 적혀있는 값만큼 이동하여 다음 풍선을 터뜨린다. 
양수가 적혀 있을 경우에는 오른쪽으로, 음수가 적혀 있을 때는 왼쪽으로 이동한다. 풍선은 원형으로 놓여 있다고 생각한다. 
즉, 1번 풍선의 왼쪽에 N번 풍선이 있고, N번 풍선의 오른쪽에 1번 풍선이 있는 것이다. 이동할 때에는 이미 터진 풍선은 빼고 생각한다.

예를 들어 다섯 개의 풍선 안에 차례로 3, 2, 1, -3, -1이 적혀 있었다고 하자. 
이 경우 3이 적혀 있는 1번 풍선, -3이 적혀 있는 4번 풍선, -1이 적혀 있는 5번 풍선, 1이 적혀 있는 3번 풍선, 2가 적혀 있는 2번 풍선의 순서대로 터지게 된다.
*/

public class Main_2346 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int[] balloons = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < balloons.length; i++) {
			balloons[i] = Integer.parseInt(st.nextToken());
		}

		sb.append(1).append(" ");

		int index = 0;
		int num = balloons[0];
		balloons[0] = 0; // 첫 번째 풍선 터뜨린 건 값 0으로 바꾸기

		for (int i = 0; i < N - 1; i++) {
			if (num >= 0) {
				for (int j = 0; j < num;) { // 풍선에 쓰여진 숫자만큼 옆으로 (양수)
					index++;
					index %= N; // 맨 끝에 다다른 경우
					if (balloons[index] != 0) { // 터진 건 패스하고 안 터진거만 count
						j++;
					}
				}
			} else {
				for (int j = 0; j < num * -1;) { // 풍선에 쓰여진 숫자만큼 옆으로 (음수)
					index--;
					while (index < 0) { // 맨 끝에 다다른 경우
						index += N;
					}
					if (balloons[index] != 0) {
						j++;
					}
				}
			}

			num = balloons[index];
			balloons[index] = 0;
			sb.append(index + 1).append(" ");
		}

		bw.write(sb.toString() + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
