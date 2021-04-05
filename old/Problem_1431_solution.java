package test;

import java.util.*;
 
 public class Problem_1431_solution { 
 	public static void main(String[] args) { 
 		
		Scanner s = new Scanner(System.in); 
 		MyComparator mc = new MyComparator(); 
 		 
 		int N = s.nextInt(); 
 		List<String> arr = new ArrayList<String>(); 
 		 
 		for(int i=0; i<N; i++) { 
 			arr.add(s.next()); 
 		} 
 		 
 		Collections.sort(arr, mc); 
 		 
 		for(String str : arr) { 
 			System.out.println(str); 
 		} 
 	} 
 } 
 
 class MyComparator implements Comparator<String> { 
 
 	@Override 
 	public int compare(String str1, String str2) { 
 		if(str1.length() > str2.length()) 
 			return 1; 
 		else if(str1.length() < str2.length()) 
 			return -1; 
 		 
 		else { 
 			int sum1 = 0, sum2 = 0; 
 			for(int i=0; i<str1.length(); i++) { 
 				if(str1.charAt(i)>='0' && str1.charAt(i) <= '9') 
 					sum1 += str1.charAt(i)-'0'; 
 			} 
 			for(int i=0; i<str2.length(); i++) { 
 				if(str2.charAt(i)>='0' && str2.charAt(i) <= '9') 
 					sum2 += str2.charAt(i)-'0'; 
 			} 
 			 
 			if(sum1 > sum2) 
 				return 1; 
 			else if(sum1 < sum2) 
 				return -1; 
 			 
 			else { 
 				for(int i=0; i<str1.length(); i++) { 
 					if(str1.charAt(i) > str2.charAt(i)) { 
 						return 1; 
 					} 
 					else if(str1.charAt(i) < str2.charAt(i)) { 
 						return -1; 
 					} 
 				} 
 			} 
 		} 
 		return 0; 
 	} 
} 
