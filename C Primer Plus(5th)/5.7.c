#include<stdio.h>
float cube(float num)
{
    return (num*num*num);
}
int main()
{
    float a;
    scanf("%f",&a);
    //printf("%f\n",a);
    printf("%f",cube(a));
    return 0;
}
