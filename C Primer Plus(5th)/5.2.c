#include<stdio.h>
int main()
{
    int num;
    scanf("%d",&num);
    for(int i = num;i <= num + 10;i++){
        printf("%d\t",i);
    }
    return 0;
}
