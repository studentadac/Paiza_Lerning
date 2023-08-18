//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__stdin_2
//コメント：
//コード：
//```c
#include <stdio.h>
int main(void){
    const int n=2;
    for (int i = 0; i < n; i++) {
    char str[12];
    fgets(str, sizeof(str), stdin);
    printf("%s", str);
    
    }
    return 0;
}
//```