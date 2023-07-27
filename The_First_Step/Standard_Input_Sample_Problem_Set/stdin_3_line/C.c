//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/stdin/stdin_3_line
//コメント：
//コード：
//```c
#include <stdio.h>
int main(void){
    const int n=3;
    for (int i = 0; i < n; i++) {
    char str[101];
    fgets(str, sizeof(str), stdin);
    printf("%s", str);
    
    }
    return 0;
}
//```