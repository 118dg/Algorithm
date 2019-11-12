#include<stdio.h>
int max(int a,int b){
    if(a>b)
        return a;
    return b;
}

int main(){
    int i, A[30005], n;
    int dp[30005];
    int ans=0; //초기화 꼭 해!
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&A[i]);
    }
    dp[0]=A[0];
    if(n>0) dp[1] = A[0]+A[1];
    if(n>1) dp[2] = max(A[1]+A[2],dp[0]+A[2]);
    ans = max(dp[0],max(dp[1],dp[2]));
    for(i=3;i<n;i++){
        dp[i] = max(dp[i-1],max(dp[i-2]+A[i],dp[i-3]+A[i-1]+A[i]));
        ans = max(dp[i],ans);
    }
    printf("%d",ans);
return 0;
}
