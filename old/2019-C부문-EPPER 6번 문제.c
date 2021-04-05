#include<stdio.h>
int main(){
    int i, j, n, count=0, A[8]={0};
    for(i=1;i<4;i++) scanf("%d",&A[i]);
    A[4]=A[1]+A[2];
    A[5]=A[1]+A[3];
    A[6]=A[2]+A[3];
    A[7]=A[1]+A[2]+A[3];
    scanf("%d",&n);
    for(j=0;j<8;j++) if(A[j]==n) count++;
    printf("%d",count);
    return 0;
}
