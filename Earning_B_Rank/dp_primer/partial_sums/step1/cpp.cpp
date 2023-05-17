//言語：cpp
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_partial_sums_step1
//コメント：   dp[j] += dp[j - num[i]]; がなぜそうなるのかがわからない
https://marine07.com/3690/dp/
そこだけ上記URLを参考

//コード：
//```cpp

#include <bits/stdc++.h>
#define rep(i, n) for (int i = 0; i < (int)(n); i++)
#include<algorithm>
using namespace std;
int main(void) {
    int x, n;
    std::cin >> n >> x;

    long long dp[x + 1];

    rep(i, x + 1)
    {
        dp[i] = 0;

    }
    dp[0] = 1;

    int num[n];
    rep(i, n)std::cin >> num[i];


    rep(i, n)
    {
        for (int j = x + 1; j >= num[i]; j--)
        {
            if (dp[j - num[i]])
            {
                dp[j] += dp[j - num[i]];
            }
        }
    }
    std::cout << dp[x] % 1000000007 << std::endl;
    return 0;
}


//```