//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__arithmetic_substitution_op_3
//コメント：
//コード：
//```c
#include <stdio.h>
int main(void){
    
    int A = 202,B = 134,C = 107;
    int D= (A+B)*C;
    D*=D;
    printf("%d", D);
    return 0;
}
//```