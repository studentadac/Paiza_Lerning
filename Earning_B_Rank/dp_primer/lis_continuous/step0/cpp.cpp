//言語：cpp
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_lis_continuous_step0
//コメント：
//コード：
//```cpp
#include <iostream>
using namespace std;
int main(void){
 
 int n;
 std::cin >> n;
 int heights[n];
 int dp[n];
 for (int i = 0; i < n; i++) {
    std::cin >> heights[i];
    dp[i]=1;
 }
 int cnt=0;
 for (int i = 0; i < n-1; i++) {
    
    if(heights[i]<=heights[i+1])
    {
        ++dp[cnt];
        
    }
    else
    {
        ++cnt;
    }
    
    
 }
 
         cout << *max_element(dp,dp + n)<<endl;

 
    return 0;
}
//```