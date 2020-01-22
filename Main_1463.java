
import java.util.*;

public class Main_1463 {

 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);

  int n = s.nextInt();
  int arr[] = new int[1000005];
  arr[1] = 0;
  for (int i = 2; i <= n; i++) {
   arr[i] = arr[i - 1] + 1;
   if (i % 3 == 0)
    arr[i] = Math.min(arr[i], arr[i / 3] + 1);
   if (i % 2 == 0)
    arr[i] = Math.min(arr[i], arr[i / 2] + 1);
  }
  System.out.println(arr[n]);
 }
}




  
