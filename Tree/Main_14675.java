import java.util.ArrayList;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<String> l=new ArrayList<>();
        int N=s.nextInt()+1;
        int[] a=new int[N];
        for(int i=0;i<N-2;i++)
        {
            a[s.nextInt()]++; a[s.nextInt()]++;
        }
        
        int q=s.nextInt();
        
        while(q-->0) {
            int c=s.nextInt(),d=s.nextInt(); 
            if(c==1 && a[d]==1){l.add("no");}
            else {l.add("yes");}}
        for(String g:l)System.out.println(g);
        }
    }
