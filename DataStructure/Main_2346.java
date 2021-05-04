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
        
        //1�� ǳ��
        sb.append(index + 1 + " ");
        print++;
        numArr[index] = 0; //ǳ�� �Ͷ߸� �� �� 0���� �ٲٱ�
        
        while(print != N) {
        	
        	index += numArr[index];
        	
        	while(numArr[index] == 0) { //�̹� �Ͷ߷ȴ� ǳ�����̸� �н�
        		
        		if(numArr[index] > 0) { //���������� ���� �־�����
        			index += 1;
        		}
        		else { //�������� ���� �־�����
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
