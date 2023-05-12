//言語：cpp
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_apples_step2
//コメント：
//コード：前問の模範解答を参考にしたので提出した回答は今回の模範解答とほぼ同じ
出典 https://paiza.jp/works/mondai/reviews/show/f547bb771ec0f21546076fd696f0964c
//```cpp
#include<iostream>
#include<cstring>
using namespace std;

int main(){
    int n,x, a,y, b;
    cin >> n >>x>> a>>y >> b;

    int dp[n+y];
    memset(dp, 0x3f, sizeof(dp));

    dp[0] = 0;
    for(int i = 1; i < n+y; i++){
        if(i >= x){
            dp[i] = min(dp[i], dp[i-x] + a);
        }
        if(i >= y){
            dp[i] = min(dp[i], dp[i-y] + b);
        }
      //  std::cout << i<<" "<<dp[i] << std::endl;
    }

    for(int i = n+y-2; i >= 1; i--){
        dp[i] = min(dp[i], dp[i+1]);    //  std::cout << i<<" "<<dp[i] << std::endl;
    }
    
    cout << dp[n] << endl;

    return 0;
}
//```