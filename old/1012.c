#include<stdio.h>
int main(){
    int i, j, p=1;
    int test, t, n, m, k, x, y, count=0, flag=0;
    scanf("%d",&test);

    for(t=1;t<=test;t++){
        scanf("%d%d%d",&n,&m,&k);
        int A[m][n];

        //A배열 초기화
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                A[i][j]=0;
            }
        }

        printf("t=%d, 배추 심은 자리 입력받기\n",t); //배추 심은 자리 입력받기
        printf("n=%d, m=%d, k=%d, p=%d\n",n,m,k,p);
        for(p=1;p<=k;p++){
            printf("\nfor문 들어옴!\n");
            scanf("%d%d",&y,&x);

            printf("k=%d, 지렁이 개수 세기\n",p);
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
                count++; printf("x=%d, y=%d, 지렁이: %d\n",x,y,count);
            }
            if(count==0){
                count++; printf("x=%d, y=%d, 지렁이: %d\n",x,y,count);
            }
            A[x][y]=1;
            flag=0;
        }
        printf("count: %d\n\n",count);
        count = 0;
    }
    return 0;
}
