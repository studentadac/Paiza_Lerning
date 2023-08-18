//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__loop_boss
//コメント：
//コード：
//```c
#include <stdio.h>
int main(void){
  
    const int n=100;
    //scanf("%d",&n);
    for (int i = 1; i <= n; i++) {
        if(i%3!=0&&i%5!=0)
        printf("%d",i);
        else
        {
            if(i%3==0)
            printf("Fizz");
            if(i%5==0)
            printf("Buzz");
            
        }
        
        
        printf("\n");
        /* code */
    }
    return 0;
}
//```