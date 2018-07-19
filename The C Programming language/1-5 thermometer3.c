#include <stdio.h>
#define Lower 0
#define Upper 300
#define step 20
int main()
{
    int fahr;
    for(fahr = Upper;fahr >= Lower;fahr -= step){
        printf("%3d %6.1f\n",fahr,(5.0 / 9.0) * fahr - 32);
    }
    return 0;
}
