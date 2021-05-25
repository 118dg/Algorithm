//컴퓨터알고리즘 수업 시간에 배웠던 0 - 1 배낭 문제!

//배낭 문제

// 물건 𝑛개의 집합 𝑆 = {1, 2, … , 𝑛}와 𝑊 = {𝑤1, 𝑤2, … , 𝑤𝑛}, 𝑃 = {𝑝1, 𝑝2, … , 𝑝𝑛} 가 주어져 있다.
//𝑤𝑖는 각 물건 𝑖의 무게, 𝑝𝑖는 물건 𝑖를 시장에 팔았을 때 얻을 수 있는 이윤이다.
//배낭의 크기 즉, 어떤 사람이 배낭을 짊어질 수 있는 최대 무게를 𝑀이라고 할 때, 
//배낭에 이러한 물건들을 넣어 시장에 파는 경우 얻을 수 있는 최대 이윤을 구한다.
// 조건 σ𝑖=1 𝑛 𝑤𝑖𝑥𝑖 ≤ 𝑀을 만족시키면서 이윤의 총합인 σ𝑖=1 𝑛 𝑝𝑖𝑥𝑖의 값을 최대화하는 문제

// 0 − 1 배낭 문제
//- 𝑥𝑖값이 0 또는 1 일 때만 허용하는 경우
//- 물건을 가져가거나 가져가지 않는 경우만을 허용

// 분수 배낭 문제
//- 𝑥𝑖값이 0 ≤ 𝑥𝑖 ≤ 1인 경우
//- 물건을 분할하여 가져갈 수 있는 것을 의미

// 0 − 1 배낭 문제를 효율적으로 해결하는 다항 시간 알고리즘은 아직 존재하지 않으나,
//분수 배낭 문제는 욕심쟁이 알고리즘에 의해 아주 간단하게 해결됨


/*
이 문제는 아주 평범한 배낭에 관한 문제이다.

한 달 후면 국가의 부름을 받게 되는 준서는 여행을 가려고 한다. 
세상과의 단절을 슬퍼하며 최대한 즐기기 위한 여행이기 때문에, 가지고 다닐 배낭 또한 최대한 가치 있게 싸려고 한다.

준서가 여행에 필요하다고 생각하는 N개의 물건이 있다. 
각 물건은 무게 W와 가치 V를 가지는데, 해당 물건을 배낭에 넣어서 가면 준서가 V만큼 즐길 수 있다. 
아직 행군을 해본 적이 없는 준서는 최대 K만큼의 무게만을 넣을 수 있는 배낭만 들고 다닐 수 있다. 
준서가 최대한 즐거운 여행을 하기 위해 배낭에 넣을 수 있는 물건들의 가치의 최댓값을 알려주자.


<입력>

첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다.
두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.

입력으로 주어지는 모든 수는 정수이다.

<출력>
한 줄에 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 출력한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main_12865 {
 
	static Integer[][] dp;
	static int[] W; // weight
	static int[] V; // value
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int N = Integer.parseInt(st.nextToken()); //물품의 개수
		int K = Integer.parseInt(st.nextToken()); //버틸 수 있는 무게
 
		W = new int[N];
		V = new int[N];
 
		dp = new Integer[N][K + 1];
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			W[i] = Integer.parseInt(st.nextToken()); //각 물체의 무게
			V[i] = Integer.parseInt(st.nextToken()); //해당 물체의 가치
		}
 
		System.out.println(knapsack(N - 1, K));
	}
 
	public static int knapsack(int i, int k) {
		// i가 0미만, 즉 범위 밖이 된다면
		if (i < 0)
			return 0;
		
		// 탐색하지 않은 위치라면?
		if (dp[i][k] == null) {
			
			// 현재 물건(i)을 추가로 못담는 경우 (이전 i값 탐색) 
			if(W[i] > k) {
				dp[i][k] = knapsack(i - 1, k);
			}
			// 현재 물건(i)을 담을 수 있는 경우 
			else {
				// 이전 i값과 이전 i값에 대한 k-W[i]의 값 + 현재 가치(V[i])중 큰 값을 저장  
				dp[i][k] = Math.max(knapsack(i - 1, k), knapsack(i - 1, k - W[i]) + V[i]);
				// (1) 현재 물건 안 넣는 대신 아예 배낭 크기가 K라고 생각했을 때의 가치 값
				// (2) 현재 물건 넣을 공간 뺀 K-W[i]가 배낭 크기라고 생각했을 때의 가치에다가 현재 물건 가치 더한 값
				// (1), (2) 중 큰 값!
			}
		}
		return dp[i][k];
	}
}
