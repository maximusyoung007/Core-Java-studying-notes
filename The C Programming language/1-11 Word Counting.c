#include<stdio.h>
#define IN 1 //inside a word
#define OUT 0 // outside a word
int main()
{
    int c,nl,nw,nc,state;
    state = OUT;
    nl = nw = nc = 0;
    while((c = getchar()) != EOF){
        nc++;
        if(c == '\n')
            nl++;
        if(c == '\t' || c == '\n' || c == ' '){
            state = OUT;
        }
        else if(state == OUT){
            nw++;
            state = IN;
        }
    }
    printf("%d %d %d\n",nl,nw,nc);
}
