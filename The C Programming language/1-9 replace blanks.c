#include<stdio.h>
int main()
{
    int c;
    int lastc = 'a';
    while((c = getchar()) != EOF){
        if(c != ' ')
            putchar(c);
        else if(c == ' '){
            if(lastc != ' ')
                putchar(c);
        }
        lastc = c;
    }
}
