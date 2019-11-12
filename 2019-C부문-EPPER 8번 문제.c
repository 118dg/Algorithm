#include<stdio.h>
int cal(int a,int b,char c){
    //printf("a는 : %d\n",a);
    //printf("b는 : %d\n",b);
    //printf("c는 : %c\n",c);

    if(c=='+') return a+b;
    else if(c=='-') return a-b;
    else if(c=='/') return a/b;
    else if(c=='*') return a*b;
}

int main(){
    int i, n, ans=0;
    scanf("%d",&n);
    char line;
    scanf("%c",&line);
    char A[15];
    for(i=0;i<n;i++){
            scanf("%c",&A[i]);
            scanf("%c",&line);
            //printf("입력%d: %c\n",i,A[i]);
        }
    ans = cal((int)A[0]-48,(int)A[1]-48,A[2]);
    if (n>3)
        for(i=3;i<n-1;i=i+2){
            ans = cal(ans,(int)A[i]-48,A[i+1]);
        }
    printf("%d",ans);
return 0;
}
