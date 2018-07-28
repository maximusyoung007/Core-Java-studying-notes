#include<stdio.h>
void output1(void);//must need
void output2(void);
int main(void)
{
    for(int i = 0;i < 3;i++){
        output1();
    }
    output2();
    return 0;
}
void output1(void)
{
    printf("for he's a jolly good fellow!\n");
}
void output2(void)
{
    printf("which nobody can deny.\n");
}
