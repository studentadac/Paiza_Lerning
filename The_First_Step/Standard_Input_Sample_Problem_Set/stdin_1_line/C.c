//言語：C言語
//問題URL:https://paiza.jp/works/mondai/stdin/stdin_1_line
//コメント：
//コード：
//```c
#include <stdio.h>
int main(void){
    // 自分の得意な言語で
    // Let's チャレンジ！！
    char str[101];
    fgets(str, sizeof(str), stdin);
    printf("%s", str);
    return 0;
}
//```