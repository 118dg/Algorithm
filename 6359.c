#include<stdio.h>
int main(){
    int t, test;
    printf("testcase 입력: "); scanf("%d",&test);
    for(t=0;t<test;t++){
        int n;
        printf("숫자 입력: "); scanf("%d",&n);
        int count = 0; //열린문 개수
        int A[n+5]; //감옥: 열려있으면 0, 닫혀있으면 1

        //printf("문 다 열기!\n"); //문 다 열기
        for(int i=1;i<=n;i++){
            A[i]=0;
        }

        //printf("문 열고 닫기!\n"); //문 열고 닫기
        for(int i=2;i<=n;i++){
            //printf("%d번째 여닫기\n",i);
            for(int j=1;i*j<=n;j++)
                if(A[i*j]==1) A[i*j]=0;
                else A[i*j]=1;
        }

        //printf("열린문 개수 세기!\n");//열린문 개수 세기
        printf("A: [");
        for(int i=1;i<=n;i++){
            if(A[i]==0) count++;
            printf("%d ",A[i]);
        }
        printf("]\n");
        printf("열린문 개수: %d\n",count);
    }
    return 0;
}
