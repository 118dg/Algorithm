import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_2346 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int[] numArr = new int[N];
        int index = 0, print = 0;
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < numArr.length; i++) {
        	numArr[i] = Integer.parseInt(st.nextToken());
        }
        
        //1번 풍선
        sb.append(index + 1 + " ");
        print++;
        numArr[index] = 0; //풍선 터뜨린 건 값 0으로 바꾸기
        
        while(print != N) {
        	
        	index += numArr[index];
        	
        	while(numArr[index] == 0) { //이미 터뜨렸던 풍선들이면 패스
        		
        		if(numArr[index] > 0) { //오른쪽으로 가고 있었으면
        			index += 1;
        		}
        		else { //왼쪽으로 가고 있었으면
        			index -= 1;
        			if(index < 0)
        				index += N;
        		}
        	}
        	
            sb.append(index + 1 + " ");
            print++;
            numArr[index] = 0;
        }
 
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
