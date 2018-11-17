#include<stdio.h>
int main()
{
    unsigned int a = 4294967295;
    float b = 3.4E38;
    float c = b * 10;
    float d = 0.1234E-2;
    printf("%u+1=%u",a,a+1);
    printf("%e*10=%e",b,c);
    printf("%f/10=%f",d,d/10);
    return 0;
}
