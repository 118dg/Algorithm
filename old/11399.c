#include<stdio.h>
int main(){
    int i, j, k, n, min, num, A[1005],B[1005];
    int sum = 0;
    printf("����� ��: "); scanf("%d",&n);
    printf("�ð� �Է�: ");
    for(i=0;i<n;i++){
        scanf("%d",&A[i]);
    }
    int count = n;
    for(i=1;i<n;i++){
        min = A[0];
        num = 0;
        for(j=0;j<count;j++)
            if(A[j]<min) {
                min = A[j];
                num = j;
            }
        printf("�ּ� �ֱ�!\n");
        B[i-1]=min;
        //
        printf("B: [");
        for(int p=0;p<n;p++) printf("%d ",B[p]);
        printf("]\n");
        //
        printf("�б�!\n");
        for(k=num;k<count-1;k++) A[k]=A[k+1];
        count--; printf("���� ����: %d\n",count);
        //
        printf("A: [");
        for(int p=0;p<n;p++) printf("%d ",A[p]);
        printf("]\n");
        //
    }
    B[i-1]=A[0];
    //
    printf("B: [");
    for(int p=0;p<n;p++) printf("%d ",B[p]);
    printf("]\n");
    //
    for(i=0;i<n;i++)
        for(j=0;j<=i;j++) sum+=B[j];
    printf("%d",sum);
    return 0;
}
