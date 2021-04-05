#include<stdio.h>
char ch[100];
int top=0;
void push(char e){
    ch[top++] = e;
}

int main(){
    int n;
    scanf("%d",&n);
    char line;
    scanf("%c",&line);
    int i, t, flag=0, count=0;
    char c;
    for(t=0;t<n;t++){
        for(int p=0;p<100;p++) ch[p]='0'; //ch배열 초기화
        printf("test: %d\n",t);
        do{
            scanf("%c",&c);
            for(i=0;i<top-1;i++){
                if(ch[i]==c) {flag=1; break;}
            }
            if(ch[top-1]!=c) push(c);
            //
            printf("배열 확인: ");
            for(int j=0;j<top;j++) printf("%c",ch[j]);
            printf("\n");
            //
        }while(c!='\n');
        if(flag==0) count++;
        flag=0;
        top=0;
        printf("count: %d\n",count);
    }
    printf("%d",count);
    return 0;
}
