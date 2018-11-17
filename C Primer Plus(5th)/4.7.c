#include<stdio.h>
#define GALLON 3.785
#define MILE 1.609
int main()
{
    float mile,gallon;
    printf("please input miles and gollons:");
    scanf("%f %f",&mile,&gallon);
    printf("miles per gallon:%.1f\n",mile/gallon);
    printf("Litres per 100 kilometer:%.1f\n",gallon*GALLON/(100*mile*MILE));
    return 0;
}
