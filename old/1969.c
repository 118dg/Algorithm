#include<stdio.h>
int main(){
    int i, j, n, len, count=0;
    printf("n �Է�: "); scanf("%d",&n);
    printf("len �Է�: "); scanf("%d",&len);

    int B[n][4][len], C[4][len];
    int max, num;
    char ans[len];


    printf("B�迭 �ʱ�ȭ\n"); //B �迭 �ʱ�ȭ
    for(int p=0; p<n; p++)
        for(int q=0; q<4; q++)
            for(int r=0; r<len; r++)
                B[p][q][r] = 0;

    /*
    printf("B�迭 �ʱ�ȭ Ȯ���ϱ�\n"); //B �迭 Ȯ���ϱ�
    for(int p=0; p<n; p++){
        printf("p = %d\n",p);
        for(int q=0; q<4; q++){
            for(int r=0; r<len; r++)
                printf("%d ",B[p][q][r]);
            printf("\n");
        }
        printf("\n");
    }
    */

    printf("C�迭 �ʱ�ȭ\n"); //C �迭 �ʱ�ȭ
    for(int q=0; q<4; q++)
        for(int r=0; r<len; r++)
            C[q][r]=0;

    /*
    printf("C�迭 �ʱ�ȭ Ȯ���ϱ�\n"); //C �迭 Ȯ���ϱ�
    for(int q=0; q<4; q++){
        for(int r=0; r<len; r++)
            printf("%d ",C[q][r]);
        printf("\n");
    }
    */

    printf("AGTC �� ���� ����(DNA �Է�!)\n"); //AGTC �� ���� ����
    for(i=0; i<n; i++){
        char A_i[len];
        for(j=0; j<len; j++){
            printf("i = %d, j = %d\n",i,j);
            rewind(stdin);
            scanf("%c",&A_i[j]);
            switch(A_i[j]){
                case 'A': B[i][0][j]+=1; break;
                case 'C': B[i][1][j]+=1; break;
                case 'G': B[i][2][j]+=1; break;
                case 'T': B[i][3][j]+=1; break;
                default: break;
            }
        }
    }

    printf("B�迭 Ȯ���ϱ�\n"); //B �迭 Ȯ���ϱ�
    for(int p=0; p<n; p++){
        printf("p = %d\n",p);
        for(int q=0; q<4; q++){
            for(int r=0; r<len; r++)
                printf("%d ",B[p][q][r]);
            printf("\n");
        }
        printf("\n");
    }

    printf("AGTC ���� �� ���� ����\n"); //AGTC ���� �� ���� ����
    for(int p=0; p<n; p++){
        for(int q=0; q<4; q++){
            for(int r=0; r<len; r++){
                C[q][r] += B[p][q][r];
            }
        }
    }

    printf("C�迭 Ȯ���ϱ�\n"); //C �迭 Ȯ���ϱ�
    for(int q=0; q<4; q++){
        for(int r=0; r<len; r++)
            printf("%d ",C[q][r]);
        printf("\n");
    }

    printf("�ʱ� count�� ���ϱ�\n"); //�ʱ� count�� ���ϱ�
    for(int q=0; q<4; q++){
        for(int r=0; r<len; r++)
            count += C[q][r];
    }
    printf("�ʱ� count��: %d\n",count);


    printf("AGTC ���� ������ ã�� ans�迭�� �ֱ�\n"); //AGTC �� ���� ������ �ϳ��� ã�� ans�迭�� �ֱ�
    for(int p=0; p<len; p++){
        max = C[0][p];
        num = 0;
        for(int q=1; q<4; q++){
            if(max<C[q][p]) {max=C[q][p]; num=q;}
        }
        switch(num){
            case 0: ans[p] = 'A'; break;
            case 1: ans[p] = 'C'; break;
            case 2: ans[p] = 'G'; break;
            case 3: ans[p] = 'T'; break;
            default: break;
        }
        count-=max;
        printf("%d",num); //max�� Ȯ��
    }

    printf("\nans�迭 ���\n"); //ans�迭 ���
    for(int p=0;p<len;p++){
        printf("%c",ans[p]);
    }
    printf("\ncount = %d",count);
    return 0;
}
