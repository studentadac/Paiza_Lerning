//言語：cpp
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_apples_boss
//コメント：
//コード：前々問の模範解答を参考にしたので提出した回答は今回の模範解答とほぼ同じ
出典 https://paiza.jp/works/mondai/reviews/show/f547bb771ec0f21546076fd696f0964c
//```cpp
#include<iostream>
#include<cstring>
using namespace std;

int main(){
    int n,x, a,y, b,z,c;
    cin >> n >>x>> a>>y >> b>>z>>c;

    int dp[n+z];
    memset(dp, 0x3f, sizeof(dp));

    dp[0] = 0;
    for(int i = 1; i < n+z; i++){
        if(i >= x){
            dp[i] = min(dp[i], dp[i-x] + a);
        }
        if(i >= y){
            dp[i] = min(dp[i], dp[i-y] + b);
        }
          if(i >= z){
            dp[i] = min(dp[i], dp[i-z] + c);
        }
        
      //  std::cout << i<<" "<<dp[i] << std::endl;
    }

    for(int i = n+z-2; i >= 1; i--){
        dp[i] = min(dp[i], dp[i+1]);    //  std::cout << i<<" "<<dp[i] << std::endl;
    }
    
    cout << dp[n] << endl;

    return 0;
}
//```