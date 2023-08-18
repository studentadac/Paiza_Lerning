//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__accompanied_by_stdin_3
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
    int n = 3;
    int num[n];

    for (int i = 0; i < n; i++) {
        num[i] = (int)strtol(p, &p, 10); // strtolを使って文字列から数値に変換
        
        p++; // スペースをスキップ
    }
/*
変数 N を 0 で初期化する
N に A を足した値を N へ代入する
N に B をかけた値を N へ代入する
N を C で割ったあまりを N へ代入する
N を出力する
*/
int N=(num[0]*num[1])%num[2];
    
    printf("%d\n",N);

    return 0;
}
//```