#include<stdio.h>
#define WEEK 7
int main()
{
    int days_num;
    int week,day;
    scanf("%d",&days_num);
    while(days_num > 0){
        week = days_num / WEEK;
        day = days_num % WEEK;
        if(day != 0)
            printf("%d days are %d weeks and %d days.\n",days_num,week,day);
        else
            printf("%d days are %d weeks.\n",days_num,week,day);
        scanf("%d",&days_num);
    }
    return 0;
}
