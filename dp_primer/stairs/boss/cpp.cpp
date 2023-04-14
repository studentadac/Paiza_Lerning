#include <iostream>
using namespace std;
int main(void) {
    int n, a, b; std::cin >> n >> a >> b;

    int dp[n + 1];
    dp[0] = 1;

    for (int i = 1; i <= n; i++) {
        /* code */
        dp[i] = 0;
        if (i >= a)
            dp[i] = dp[i] + dp[i - a];
        if (i >= b)
            dp[i] = dp[i] + dp[i - b];

        //         std::cout << dp[i] << std::endl;
    }

    std::cout << dp[n] << std::endl;
    return 0;
}