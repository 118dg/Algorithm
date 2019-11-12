#include<stdio.h>
int main(){
    int n, i, j, total=0, count=0;
    scanf("%d",&n);
    int sum[n+5];
    char line, e;
    scanf("%c",&line);
    for(i=0;i<n;i++){
       while(1){
            scanf("%c",&e);
            if(e=='\n') break;
            else{
                if(e=='O') {count++; total+=count;}
                else if(e=='X') count=0;
            }
       }
       sum[i]=total; total = 0; count = 0;
    }
    for(i=0;i<n;i++)
        printf("%d\n",sum[i]);
return 0;
}
