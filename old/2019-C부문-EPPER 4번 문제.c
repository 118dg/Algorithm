#include<stdio.h>
int main(){
    int i, j, k, p, n;
    scanf("%d",&n);
    int num, A[n], B[n], half[n], trash[n];

    for(i=0;i<n;i++){
        scanf("%d",&A[i]);
    }

    /*
    printf("�� �ԷµƳ� Ȯ��!\n");
    for(i=0;i<n;i++){
        printf("%d\n",A[i]);
    }
    */

    for(j=0;j<n;j++){
        num = (A[j]%100)/10; //���� �ڸ� ��
        B[j] = num;
        A[j] = A[j]/100;
    }

    /*
    printf("\n\nA Ȯ��!\n");
    for(i=0;i<n;i++){
        printf("%d ",A[i]);
    }

    printf("\n\nB Ȯ��!\n");
    for(i=0;i<n;i++){
        printf("%d ",B[i]);
    }
    printf("\n");
    */

    for(k=0;k<n;k++){
        trash[k] = A[k]*100;
        if(B[k]>=5) half[k]=(A[k]+1)*100;
        else half[k]=A[k]*100;
    }
    for(p=0;p<n;p++){
        printf("%d %d\n",half[p],trash[p]);
    }
    return 0;
}
