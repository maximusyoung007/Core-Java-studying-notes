#include<stdio.h>
int main()
{
    float a;
    printf("please input:");
    scanf("%f",&a);
    printf("a.the input is %.1f or %.1e\n",a,a);
    printf("b.the input is %+.3f or %.3E\n",a,a);
    return 0;
}
