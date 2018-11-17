#include<stdio.h>
#define HOUR 60
int main()
{
    int time;
    int hour,minute;
    scanf("%d",&time);
    while(time > 0){
        hour = time / HOUR;
        minute = time % HOUR;
        printf("the time %d hours and %d minutes\n",hour,minute);
        scanf("%d",&time);
    }
    return 0;
}
