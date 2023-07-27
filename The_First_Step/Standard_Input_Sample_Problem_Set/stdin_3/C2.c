//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/stdin/stdin_3
//コメント：
//コード：
//```c
#include <stdio.h>
int main(void){
   
   const int n=3;
 
    char str[n][101];
    for (int i = 0; i < n; i++) {
          scanf("%s", str[i]);
          printf("%s\n", str[i]);

    }
    
    
    return 0;
}
//```