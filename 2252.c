#include<stdio.h>
int main(){
    int i, j, k, n, m, a, b, temp, top=0, check=0;
    int checkA=0, checkB=0, start=0, end=0;
    scanf("%d%d",&n,&m);
    int A[n];
    for(int p=0;p<n;p++) A[p]=0;

    for(i=0;i<m;i++){
        scanf("%d%d",&a,&b);
        for(j=0;j<n;j++){
            if(A[j]==a) {checkA=1; start=j;}
            else if(A[j]==b) {checkB=1; end=j;}
        }
        if(checkA==1&&checkB==0){
            for(k=n-1;k>start+1;k--) A[k]=A[k-1];
            //A 중간 확인
            printf("확인: [");
            for(int q=0;q<n;q++) printf("%d ",A[q]);
            printf("]\n");
            //
            A[start+1]=b;
            top++;
            //A 중간 확인
            printf("확인: [");
            for(int q=0;q<n;q++) printf("%d ",A[q]);
            printf("]\n");
            //
        }
        else if(checkA==0&&checkB==1){
            for(k=n-1;k>end;k--) A[k]=A[k-1];
            //A 중간 확인
            printf("확인: [");
            for(int q=0;q<n;q++) printf("%d ",A[q]);
            printf("]\n");
            //
            A[end]=a;
            top++;
            //A 중간 확인
            printf("확인: [");
            for(int q=0;q<n;q++) printf("%d ",A[q]);
            printf("]\n");
            //
        }
        else if(checkA==1&&checkB==1){
            if(start>end){
                temp=A[end];
                for(int w=end;w<start;w++) {
                    A[w]=A[w+1];
                    //A 중간 확인
                    printf("옮기고 확인: [");
                    for(int q=0;q<n;q++) printf("%d ",A[q]);
                    printf("]\n");
                    //
                }
                A[start]=temp;
            }
            //A 중간 확인
            printf("확인: [");
            for(int q=0;q<n;q++) printf("%d ",A[q]);
            printf("]\n");
            //
        }
        else{
            A[top++]=a;
            A[top++]=b;
            //A 중간 확인
            printf("확인: [");
            for(int q=0;q<n;q++) printf("%d ",A[q]);
            printf("]\n");
            //
        }
        checkA=0; checkB=0; start=0; end=0;
    }
    top=n-1;
    for(int r=1;r<=n;r++){
        for(int t=0;t<n;t++){
            if(A[t]==r) check=1;
        }
        if(check==0){
            A[top--]=r;
        }
        check=0;
    }
    for(int q=0;q<n;q++) printf("%d ",A[q]);
    return 0;
}
