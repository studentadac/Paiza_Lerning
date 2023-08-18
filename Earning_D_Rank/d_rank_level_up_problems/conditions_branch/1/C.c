//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__conditions_branch_1
//コメント：ChatGPTに少し助けてもらってます
//コード：
//```c
#include <stdio.h>
//#include <stdlib.h>
#include <string.h>
int main(void) {
    char str[50];
    fgets(str, sizeof(str), stdin);
    // 改行文字('\n')を除去する
    str[strcspn(str, "\n")] = '\0';
    char *cmp="paiza";
    
    if(strcmp(str, cmp) == 0)
    printf("YES\n");
    else
    printf("NO\n");

    return 0;
}
//```