#include<stdio.h>
int main(){
    char ch;
    int i, x=0, count=0;
    int A[260];
    do{
        scanf("%c",&ch);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': count++; break;
            case '\n': A[x++]=count; count=0; break;
            default: break;
        }
    }while(ch!='#');
    for(i=0;i<x;i++) printf("%d\n",A[i]);
    return 0;
}
