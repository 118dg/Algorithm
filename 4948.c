#include<stdio.h>
#include<math.h>

int main(){
    int i, j, n, flag = 0, count = 0;
    scanf("%d",&n);
    while(n){
        for(i=n+1;i<=2*n;i++){
            for(j=2;j<=sqrt(i);j++){
                if(i%j==0) flag=1;
                if(flag==1) break;
            }
            if(flag==0) count++;
            flag = 0;
        }
        printf("%d\n",count);
        count = 0;
        scanf("%d",&n);
    }
    return 0;
}
