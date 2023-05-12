#include <iostream>
using namespace std;
int main(void) {
    int n; std::cin >> n;
    int dp[n + 1];
    dp[0] = 1;
    for (int i = 1; i <= n; i++) {
        /* code */
        dp[i] = 0;
        if (i >= 1)
            dp[i] = dp[i] + dp[i - 1];
        if (i >= 2)
            dp[i] = dp[i] + dp[i - 2];
    }

    std::cout << dp[n] << std::endl;
    return 0;
}