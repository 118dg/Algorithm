import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set;
		int[] cnt;
		int tc = 0;
		int root;
		boolean hasTwoMoreIncomeVector;
		int v;

		while (true) {
			set = new HashSet<>();
			cnt = new int[1001];
			root = 0;
			tc++;
			hasTwoMoreIncomeVector = false;
			v = 0;

			while (true) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				if (a == 0 && b == 0)
					break;
				if (a == -1 && b == -1)
					return;

				set.add(a);
				set.add(b);
				cnt[b]++;
				v++;
			}
			if (set.size() == 0) {
				System.out.println("Case " + tc + "is a tree.");
				continue;
			}

			Iterator<Integer> iter = set.iterator();

			while (iter.hasNext()) {
				int num = (int) iter.next();
				if (cnt[num] == 0)
					root++;
				if (cnt[num] > 1) {
					hasTwoMoreIncomeVector = true;
					break;
				}
			}

			if (hasTwoMoreIncomeVector || root != 1 || set.size() - v != 1) {
				System.out.println("Case " + tc + "is not a tree.");
			} else {
				System.out.println("Case " + tc + "is a tree.");
			}
		}

	}

}
