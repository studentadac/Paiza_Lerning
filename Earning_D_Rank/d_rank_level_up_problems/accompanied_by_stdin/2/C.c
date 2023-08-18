//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__accompanied_by_stdin_2
//コメント：
//コード：
//```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(void) {
    char str[50];
    fgets(str, sizeof(str), stdin);
    
    char *p;
    p=strtok(str, " ");
    int n = 2;
    int num[n];

    for (int i = 0; i < n; i++) {
        num[i] = (int)strtol(p, &p, 10); // strtolを使って文字列から数値に変換
        
        p++; // スペースをスキップ
    }

    int D = num[0]-num[1] ;
    int P=num[0]*num[1] ;
    printf("%d %d", D,P);

    return 0;
}
//```