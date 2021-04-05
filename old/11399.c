#include<stdio.h>
int main(){
    int i, j, k, n, min, num, A[1005],B[1005];
    int sum = 0;
    printf("사람의 수: "); scanf("%d",&n);
    printf("시간 입력: ");
    for(i=0;i<n;i++){
        scanf("%d",&A[i]);
    }
    int count = n;
    for(i=1;i<n;i++){
        min = A[0];
        num = 0;
        for(j=0;j<count;j++)
            if(A[j]<min) {
                min = A[j];
                num = j;
            }
        printf("최소 넣기!\n");
        B[i-1]=min;
        //
        printf("B: [");
        for(int p=0;p<n;p++) printf("%d ",B[p]);
        printf("]\n");
        //
        printf("밀기!\n");
        for(k=num;k<count-1;k++) A[k]=A[k+1];
        count--; printf("현재 개수: %d\n",count);
        //
        printf("A: [");
        for(int p=0;p<n;p++) printf("%d ",A[p]);
        printf("]\n");
        //
    }
    B[i-1]=A[0];
    //
    printf("B: [");
    for(int p=0;p<n;p++) printf("%d ",B[p]);
    printf("]\n");
    //
    for(i=0;i<n;i++)
        for(j=0;j<=i;j++) sum+=B[j];
    printf("%d",sum);
    return 0;
}
