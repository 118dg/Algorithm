/*
트리에서 리프 노드란, 자식의 개수가 0인 노드를 말한다.

트리가 주어졌을 때, 노드 하나를 지울 것이다. 그 때, 남은 트리에서 리프 노드의 개수를 구하는 프로그램을 작성하시오.
노드를 지우면 그 노드와 노드의 모든 자손이 트리에서 제거된다.

예를 들어, 다음과 같은 트리가 있다고 하자.


현재 리프 노드의 개수는 3개이다. (초록색 색칠된 노드) 이때, 1번을 지우면, 다음과 같이 변한다. 검정색으로 색칠된 노드가 트리에서 제거된 노드이다.


이제 리프 노드의 개수는 1개이다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

class Node{
    int num, parent, child[] = new int[50], childCnt;
    //노드 번호, 부모 번호, 자식, 자식 개수
    
    public void setChild(int childNum){
        child[childNum] = 1; //자식에 표시
        childCnt++; //자식 개수 증가
    }
}

public class Main{

    public static Node tree[];
    public static int n, delList[];
    
    public static void main(String args[]) throws Exception {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
      
    	int i, pa;
      n = Integer.parseInt(in.readLine()); //노드 개수
    	tree = new Node[n];
      delList = new int[n];
    	String line[] = in.readLine().split(" "); //노드들의 부모 입력받기
      
    	for(i=0;i<n;i++) tree[i] = new Node();
      
      //노드 정보 입력
    	for(i=0;i<n;i++){
    	    pa = Integer.parseInt(line[i]);
    	    tree[i].num = i;
          tree[i].parent = pa;
    	    if(pa!=-1) tree[pa].setChild(i);
    	}
      
    	delete(Integer.parseInt(in.readLine())); //삭제할 노드 삭제
      
    	out.write(String.valueOf(getLeaf()));
      out.close();
    	in.close();
    }

    private static int getLeaf(){
	    int i, cnt = 0;
        for(i=0;i<n;i++)
            if(tree[i]!=null && tree[i].childCnt==0) //자식 개수가 0인 노드 세기
        	      cnt++;
   	    return cnt;
    }
    
    //삭제
    public static void delete(int num){
    	makeDelList(num); //삭제할 노드부터 자식까지 삭제리스트에 추가
    	int i, k, pa;
      
	    for(i=0;i<n;i++){
    	    k = tree[i].num; //트리의 i번째 노드의 노드 번호
          
    	    if(delList[k]==1){ //삭제리스트에 해당 노드가 포함된다면
        		pa = tree[k].parent; //노드의 부모 번호
        		tree[k] = null; //노드 삭제
            
	        	if(pa!=-1 && tree[pa]!=null){ //루트 노드가 아니고 부모 노드가 삭제되지 않았다면
	        	    tree[pa].childCnt--; //그 부모의 자식 개수 줄이기
		            tree[pa].child[k] = 0; //그 부모에 해당하던 자식 false
	        	}
	        }
	    }
    }
    
    //삭제할 노드부터 그 자식까지 삭제리스트에 추가(재귀)
    private static void makeDelList(int num){
	    delList[num] = 1; //현재 노드 num번을 삭제 리스트에 추가
      
      for(int i=0;i<n;i++) //num번 노드와 연결된 자식들을 탐색
	        if(tree[num].child[i]==1)
              makeDelList(i); //그 자식도 삭제 리스트에 추가
    }
}
