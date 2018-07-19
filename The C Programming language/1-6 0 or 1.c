#include<stdio.h>
int main()
{
    int c;
    while(c = getchar() != EOF){
        printf("%d\n",c);
    }
    printf("%d\n",c);
//input something,return 1,input Ctrl+z(means end),return 0
}
