//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__stdin_boss
//コメント：
//コード：
//```c
#include <stdio.h>
#include <string.h>

int main(void){
   
    
    char str[50], *p;
    fgets(str, sizeof(str), stdin);
    
    
    p = strtok(str, " ");
    
    do
    {
       puts(p);
       p = strtok(NULL," ");
    }while(p!=NULL);
    
    
    return 0;
}
//```