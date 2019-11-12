#include<stdio.h>
int main(){
    int i, j, k, p;
    int n, min, x=0, y;
    scanf("%d",&n);
    int A[n], B[n*(n-1)/2], s[n*(n-1)/2], e[n*(n-1)/2];

    for(i=0;i<n;i++){
        scanf("%d",&A[i]);
    }
    for(j=0;j<n-1;j++){
        for(k=j+1;k<n;k++){
            B[x] = A[j]+A[k];
            s[x] = j;
            e[x] = k;
            x++;
        }
    }

    /*
    //B 확인
    printf("[");
    for(int r=0;r<n*(n-1)/2;r++){
        printf("%d  ",B[r]);
    }
    printf("]\n");
    */

    //B 다 절댓값으로!
    for(int r=0;r<n*(n-1)/2;r++){
        if(B[r]<0) B[r]*=-1;
    }

    /*
    //B 확인
    printf("[");
    for(int r=0;r<n*(n-1)/2;r++){
        printf("%d  ",B[r]);
    }
    printf("]\n");
    */

    min = B[0];
    y=0;
    for(p=0;p<n*(n-1)/2;p++){
        if(B[p]<min) {min=B[p]; y=p;}
    }
    printf("%d %d",A[s[y]],A[e[y]]);
    return 0;
}
