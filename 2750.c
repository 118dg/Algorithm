#include<stdio.h>
int stack[1005];

void push(int top, int e){
    stack[top] = e;
}
int main(){
    int i, j, k;
    int n, e, top, count=0, flag=0;
    printf("�� ����: "); scanf("%d",&n);
    //�ϴ� ù��° ���� �迭 ù ĭ�� �ֱ�
    printf("���� �Է�: "); scanf("%d",&e);
    push(0,e);
    //printf("�ϴ� ù��°�� Ȯ�� %d\n",stack[0]);

    for(i=1;i<n;i++){
        printf("i��: %d\n",i);
        top=0;
        //���� ����
        count++;
        printf("���� ����: %d\n",count);
        //���� �Է¹ޱ�
        printf("���� �Է�: "); scanf("%d",&e);

        for(j=0;j<count;j++){
            if(stack[j]<e) top = j+1;
        }

        //���ʿ��� ���������� �б�
        //for(k=top;k<count;k++) stack[k+1]=stack[k];
        //�̷��� �ϸ� �ȵ� ���� �� ���Ĺ���

        //�����ʿ��� ���ʲ� �������
        for(k=count;k>top;k--) stack[k]=stack[k-1];
        //�а��� �߰� Ȯ��
        printf("�߰� Ȯ��: [");
        for(int p=0;p<n;p++) printf("%d ",stack[p]);
        printf("]\n");
        //���� �迭�� �ֱ�
        push(top,e);
        //�ְ��� �߰� Ȯ��
        printf("�߰� Ȯ��: [");
        for(int q=0;q<n;q++) printf("%d ",stack[q]);
        printf("]\n");
    }
    //for(i=0;i<n;i++) printf("%d\n",stack[i]);
    return 0;
}
