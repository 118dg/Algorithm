#include<stdio.h>
int main(){
    int i, j;
    int r1, c1, r2, c2, r11, c11, r12, c12;
    scanf("%d %d %d %d",&r1, &c1, &r2, &c2);
    r11 = (r1<0) ? r1*(-1) : r1;
    r12 = (r2<0) ? r2*(-1) : r2;
    c11 = (c1<0) ? c1*(-1) : c1;
    c12 = (c2<0) ? c2*(-1) : c2;
    max = (r11>r12) ? r11 : r12;
    max = (max>c11) ? max : c11;
    max = (max>c12) ? max : c12;
    int A[2*max+1][2*max+1];
    int n=0, m=0, count=0;
    while(true){
        for(i=n;i<=m;i++)
            A[i-r1][j-r1]=count++;


    }
    return;
}
