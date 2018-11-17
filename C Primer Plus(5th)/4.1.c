#include<stdio.h>
int main()
{
    char name1[100],name2[100];
    printf("input your first name:");
    scanf("%s",&name1);
    printf("input your last name:");
    scanf("%s",&name2);
    printf("hello,%s %s",name1,name2);
    return 0;
}
