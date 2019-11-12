#include<stdio.h>
int stack[1005];

void push(int top, int e){
    stack[top] = e;
}
int main(){
    int i, j, k;
    int n, e, top, count=0, flag=0;
    printf("총 개수: "); scanf("%d",&n);
    //일단 첫번째 숫자 배열 첫 칸에 넣기
    printf("숫자 입력: "); scanf("%d",&e);
    push(0,e);
    //printf("일단 첫번째꺼 확인 %d\n",stack[0]);

    for(i=1;i<n;i++){
        printf("i는: %d\n",i);
        top=0;
        //개수 증가
        count++;
        printf("현재 개수: %d\n",count);
        //숫자 입력받기
        printf("숫자 입력: "); scanf("%d",&e);

        for(j=0;j<count;j++){
            if(stack[j]<e) top = j+1;
        }

        //왼쪽에서 오른쪽으로 밀기
        //for(k=top;k<count;k++) stack[k+1]=stack[k];
        //이렇게 하면 안됨 값이 다 겹쳐버림

        //오른쪽에서 왼쪽꺼 끌어당기기
        for(k=count;k>top;k--) stack[k]=stack[k-1];
        //밀고나서 중간 확인
        printf("중간 확인: [");
        for(int p=0;p<n;p++) printf("%d ",stack[p]);
        printf("]\n");
        //숫자 배열에 넣기
        push(top,e);
        //넣고나서 중간 확인
        printf("중간 확인: [");
        for(int q=0;q<n;q++) printf("%d ",stack[q]);
        printf("]\n");
    }
    //for(i=0;i<n;i++) printf("%d\n",stack[i]);
    return 0;
}
