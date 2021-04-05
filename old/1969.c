#include<stdio.h>
int main(){
    int i, j, n, len, count=0;
    printf("n 입력: "); scanf("%d",&n);
    printf("len 입력: "); scanf("%d",&len);

    int B[n][4][len], C[4][len];
    int max, num;
    char ans[len];


    printf("B배열 초기화\n"); //B 배열 초기화
    for(int p=0; p<n; p++)
        for(int q=0; q<4; q++)
            for(int r=0; r<len; r++)
                B[p][q][r] = 0;

    /*
    printf("B배열 초기화 확인하기\n"); //B 배열 확인하기
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

    printf("C배열 초기화\n"); //C 배열 초기화
    for(int q=0; q<4; q++)
        for(int r=0; r<len; r++)
            C[q][r]=0;

    /*
    printf("C배열 초기화 확인하기\n"); //C 배열 확인하기
    for(int q=0; q<4; q++){
        for(int r=0; r<len; r++)
            printf("%d ",C[q][r]);
        printf("\n");
    }
    */

    printf("AGTC 각 개수 세기(DNA 입력!)\n"); //AGTC 각 개수 세기
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

    printf("B배열 확인하기\n"); //B 배열 확인하기
    for(int p=0; p<n; p++){
        printf("p = %d\n",p);
        for(int q=0; q<4; q++){
            for(int r=0; r<len; r++)
                printf("%d ",B[p][q][r]);
            printf("\n");
        }
        printf("\n");
    }

    printf("AGTC 한줄 당 개수 세기\n"); //AGTC 한줄 당 개수 세기
    for(int p=0; p<n; p++){
        for(int q=0; q<4; q++){
            for(int r=0; r<len; r++){
                C[q][r] += B[p][q][r];
            }
        }
    }

    printf("C배열 확인하기\n"); //C 배열 확인하기
    for(int q=0; q<4; q++){
        for(int r=0; r<len; r++)
            printf("%d ",C[q][r]);
        printf("\n");
    }

    printf("초기 count값 구하기\n"); //초기 count값 구하기
    for(int q=0; q<4; q++){
        for(int r=0; r<len; r++)
            count += C[q][r];
    }
    printf("초기 count값: %d\n",count);


    printf("AGTC 제일 많은거 찾고 ans배열에 넣기\n"); //AGTC 중 제일 많은거 하나씩 찾고 ans배열에 넣기
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
        printf("%d",num); //max값 확인
    }

    printf("\nans배열 출력\n"); //ans배열 출력
    for(int p=0;p<len;p++){
        printf("%c",ans[p]);
    }
    printf("\ncount = %d",count);
    return 0;
}
