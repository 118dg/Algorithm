#include<stdio.h>
int main(){
    int i, j, p, top=2;
    char A[14],birth[8],sex[1];
    for(i=0;i<13;i++){
        scanf("%c",&A[i]);
    }
    switch(A[7]) {
        case '1': birth[0]='1'; birth[1]='9'; sex[0]='M'; break;
        case '2': birth[0]='1'; birth[1]='9'; sex[0]='F'; break;
        case '3': birth[0]='2'; birth[1]='0'; sex[0]='M'; break;
        case '4': birth[0]='2'; birth[1]='0'; sex[0]='F'; break;
        default: break;
    }


    for(j=0;j<6;j++){
        birth[top++]=A[j];
    }
    for(p=0;p<4;p++) printf("%c",birth[p]);
    printf("-");
    for(p=4;p<6;p++) printf("%c",birth[p]);
    printf("-");
    for(p=6;p<8;p++) printf("%c",birth[p]);
    printf(" %c",sex[0]);

    return 0;
}
