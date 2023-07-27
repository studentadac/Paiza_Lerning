//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/stdin/stdin_n_line
//コメント：
//コード：
//```c
#include <stdio.h>
int main(void){
    int n=3;
    scanf("%d" , &n);
    getchar();
    
    for (int i = 0; i < n; i++) {
    char str[101];
    fgets(str, sizeof(str), stdin);
    printf("%s", str);
    
    }
    return 0;
}
//```