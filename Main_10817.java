import java.util.Arrays;

import java.util.Scanner;

public class Main_10817 {

public static void main(String[] args) {

// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);

int arr[] = new int[3];

for (int i = 0; i < 3; i++) {

arr[i] = s.nextInt();

}

Arrays.sort(arr);

System.out.println(arr[1]);

}

}