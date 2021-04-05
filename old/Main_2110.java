import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2110 {

  // http://mygumi.tistory.com/301
  // https://github.com/hotehrud/acmicpc
  //������ Ǯ��..

  private void solve() {
    int n = sc.nextInt();
    int c = sc.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }

    Arrays.sort(array);

    int left = 1; // ������ �ּ� �Ÿ�
    int right = array[n - 1] - array[0]; // ������ �ִ� �Ÿ�
    int d = 0;
    int ans = 0;

    while (left <= right) {
      int mid = (left + right) / 2; // ����
      int start = array[0];
      int cnt = 1;

      // ����(d) �� �������� ������ ��ġ
      for (int i = 1; i < n; i++) {
        d = array[i] - start;
        if (mid <= d) {
          ++cnt;
          start = array[i];
        }
      }

      if (cnt >= c) {
        // �������� ���� ������ => ���� ������
        ans = mid;
        left = mid + 1;
      } else {
        // �����Ⱑ �� ��ġ�Ǿ���Ѵ�. => ���� ������
        right = mid - 1;
      }
    }
    System.out.println(ans);
  }

  public static void main(String[] args) {
    sc.init();

    new Main_2110().solve();
  }

  static class sc {
    private static BufferedReader br;
    private static StringTokenizer st;

    static void init() {
      br = new BufferedReader(new InputStreamReader(System.in));
      st = new StringTokenizer("");
    }

    static String readLine() {
      try {
        return br.readLine();
      } catch (IOException e) {
      }
      return null;
    }

    static String readLineReplace() {
      try {
        return br.readLine().replaceAll("\\s+", "");
      } catch (IOException e) {
      }
      return null;
    }

    static boolean hasNext() {
      return st.hasMoreTokens();
    }

    static String next() {
      while (!st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
        }
      }
      return st.nextToken();
    }

    static long nextLong() {
      return Long.parseLong(next());
    }

    static int nextInt() {
      return Integer.parseInt(next());
    }

    static double nextDouble() {
      return Double.parseDouble(next());
    }
  }
}