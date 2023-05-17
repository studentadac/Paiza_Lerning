//言語：cpp
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_partial_sums_step0
//コメント：
//コード：
//```cpp
#include <bits/stdc++.h>
#define rep(i, n) for (int i = 0; i < (int)(n); i++)
#include<algorithm>
using namespace std;
int main(void) {
    int x, n;
    std::cin >> n >> x;

    bool dp[x + 1];

    rep(i, x + 1)
    {
        dp[i] = false;

    }
    dp[0] = true;

    int num[n];
    rep(i, n)std::cin >> num[i];

    rep(i, n)
    {
        for (int j = x + 1; j >= num[i]; j--)
        {
            if (dp[j - num[i]])
            {
                dp[j] = true;

            }

        }

    }

    if (dp[x])
        puts("yes");
    else
        puts("no");
    return 0;
}

//```