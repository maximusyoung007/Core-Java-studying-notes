#include <stdio.h>
int main()
{
    float fahr,celsius;
    int lower = -17,upper = 148,step = 11;

    celsius = lower;
    while(celsius <= upper){
        fahr = 9 * celsius / 5 + 32;
        printf("%3.0f %6.1f\n",celsius,fahr);
        celsius = celsius + step;
    }
    return 0;

}
