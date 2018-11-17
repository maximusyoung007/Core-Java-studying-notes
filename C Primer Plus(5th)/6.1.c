#include<stdio.h>
int main()
{
    char letters[27];
    for(int i = 0;i < 26;i++){
        letters[i] = i + 'a';
    }
    for(int i = 0;i < 26;i++){
        printf("%c ",letters[i]);
    }
    return 0;
}
