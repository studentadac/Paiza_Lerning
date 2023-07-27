//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/stdin/stdin_3
//コメント：参考 https://bituse.info/c_func/18 https://9cguide.appspot.com/22-01.html コンパイラから警告がでたので危険なにおいがする
//コード：
//```c
#include <stdio.h>
int main(void){
   
    
    char str[303], *p;
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