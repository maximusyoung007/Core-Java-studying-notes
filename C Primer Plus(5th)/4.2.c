#include<stdio.h>
#include<string.h>
int main()
{
    char name[20];
    int width;
    printf("please input your name:");
    scanf("%s",&name);
    printf("\"%s\"\n",name);
    printf("\"%20s\"\n",name);
    printf("\"%-20s\"\n",name);
    width = strlen(name) + 3;
    printf("%d\n",width);
    printf("\"%*s\"\n",width,name);
    return 0;
}
