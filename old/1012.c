#include<stdio.h>
int main(){
    int i, j, p=1;
    int test, t, n, m, k, x, y, count=0, flag=0;
    scanf("%d",&test);

    for(t=1;t<=test;t++){
        scanf("%d%d%d",&n,&m,&k);
        int A[m][n];

        //A�迭 �ʱ�ȭ
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                A[i][j]=0;
            }
        }

        printf("t=%d, ���� ���� �ڸ� �Է¹ޱ�\n",t); //���� ���� �ڸ� �Է¹ޱ�
        printf("n=%d, m=%d, k=%d, p=%d\n",n,m,k,p);
        for(p=1;p<=k;p++){
            printf("\nfor�� ����!\n");
            scanf("%d%d",&y,&x);

            printf("k=%d, ������ ���� ����\n",p);
            if(x==0){
                if(y==0){
                    if(A[x][y+1]==1||A[x+1][y]==1) {flag=1;}
                }
                else if(y==(n-1)){
                    if(A[x][y-1]==1||A[x+1][y]==1) {flag=1;}
                }
                else{
                    if(A[x][y-1]==1||A[x][y+1]==1||A[x+1][y]==1) {flag=1;}
                }
            }
            else if(x==m-1){
                if(y==0){
                    if(A[x][y+1]==1||A[x-1][y]==1) {flag=1;}
                }
                else if(y==(n-1)){
                    if(A[x][y-1]==1||A[x-1][y]==1) {flag=1;}
                }
                else{
                    if(A[x][y-1]==1||A[x][y+1]==1||A[x-1][y]==1) {flag=1;}
                }
            }
            else{
                if(y==0){
                    if(A[x][y+1]==1||A[x-1][y]==1||A[x+1][y]==1) {flag=1;}
                }
                else if(y==(n-1)){
                    if(A[x][y-1]==1||A[x-1][y]==1||A[x+1][y]==1) {flag=1;}
                }
                else{
                    if(A[x][y-1]==1||A[x][y+1]==1||A[x-1][y]==1||A[x+1][y]==1) {flag=1;}
                }
            }
            if(flag==0){
                count++; printf("x=%d, y=%d, ������: %d\n",x,y,count);
            }
            if(count==0){
                count++; printf("x=%d, y=%d, ������: %d\n",x,y,count);
            }
            A[x][y]=1;
            flag=0;
        }
        printf("count: %d\n\n",count);
        count = 0;
    }
    return 0;
}
