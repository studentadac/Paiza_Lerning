//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/d_rank_skillcheck_sample/diff_str
//コメント：
//コード：
//```c
#include <stdio.h>
#include <string.h>

int main(void){
    // 自分の得意な言語で
    // Let's チャレンジ！！
    char a[200],b[200];
    scanf("%s %s",a,b);
    printf("%s", strcmp(a,b)?"NG":"OK"     );
    return 0;
}
//```