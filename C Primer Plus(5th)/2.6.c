#include<stdio.h>
void smile(void);
int main()
{
    for(int i = 3;i > 0;i--){
        for(int j = 0;j < i;j++){
            smile();
        }
        printf("\n");
    }
    return 0;
}
void smile(void)
{
    printf("smile!");
}
