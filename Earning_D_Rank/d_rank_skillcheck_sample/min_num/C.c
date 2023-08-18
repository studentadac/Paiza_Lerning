//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/d_rank_skillcheck_sample/min_num
//コメント：Cはこれぐらい単純な実装だと実行速度が0.01秒で気持ちいい
//コード：
//```c
#include <stdio.h>
int main(void){
  
    const int n=5;
    int a[n],min=100;
    for (int i = 0; i < n; i++) {
       scanf("%d",&a[i]);
       if(min>a[i])
       {
       min=a[i];
       }
       /* code */
    }
    
    printf("%d",min);
    return 0;
}
//```