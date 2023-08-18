//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__conditions_branch_3
//コメント：scanfは使うべきではないが、使わないと時間食うので使用
//コード：
//```c
#include <stdio.h>
int main(void){
  
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    printf("%s",a*b<=c?"YES":"NO" );
    return 0;
}
//```