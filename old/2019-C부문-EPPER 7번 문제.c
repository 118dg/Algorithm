#include<stdio.h>
#include<stdlib.h>

int cnt = 0;
int arr[10];

void check(int start, int end){
    if(start==end || start>end) return;
    if(arr[start]==arr[end]) check(start+1,end-1);
    else{
        if(arr[start]<arr[end]){
            arr[start+1] = arr[start] + arr[start+1];
            cnt++;
            check(start+1,end);
        }
        else {
            arr[end-1]=arr[end]+arr[end-1];
            cnt++;
            check(start,end-1);
        }
    }
}
int main(void){
    int n, i;
    int start = 0;
    int end = 0;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    end = n-1;
    check(start,end);
    printf("%d",cnt);

    return 0;
}
