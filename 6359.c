#include<stdio.h>
int main(){
    int t, test;
    printf("testcase �Է�: "); scanf("%d",&test);
    for(t=0;t<test;t++){
        int n;
        printf("���� �Է�: "); scanf("%d",&n);
        int count = 0; //������ ����
        int A[n+5]; //����: ���������� 0, ���������� 1

        //printf("�� �� ����!\n"); //�� �� ����
        for(int i=1;i<=n;i++){
            A[i]=0;
        }

        //printf("�� ���� �ݱ�!\n"); //�� ���� �ݱ�
        for(int i=2;i<=n;i++){
            //printf("%d��° ���ݱ�\n",i);
            for(int j=1;i*j<=n;j++)
                if(A[i*j]==1) A[i*j]=0;
                else A[i*j]=1;
        }

        //printf("������ ���� ����!\n");//������ ���� ����
        printf("A: [");
        for(int i=1;i<=n;i++){
            if(A[i]==0) count++;
            printf("%d ",A[i]);
        }
        printf("]\n");
        printf("������ ����: %d\n",count);
    }
    return 0;
}
