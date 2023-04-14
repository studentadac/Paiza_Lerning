#include <iostream>
#include<algorithm>
using namespace std;
int main(void) {
    int n, a, b; std::cin >> n >> a >> b;
    int dp[n + 8];

    for (int i = 0; i <= 2; i++) {
        dp[i] = a;
        /* code */
    }

    for (int i = 3; i <= 4; i++) {
        dp[i] = min(2 * a, b);   /* code */
    }
    dp[5] = min(3 * a, b);

    for (int i = 6; i < n + 8; i++) {
        /* code */

        dp[i] = min(dp[i - 2] + a, dp[i - 5] + b);
    }
    std::cout << dp[n] << std::endl;
    /*
        int min_num=1000000000;
        for (int i = n; i < n+8; i++) {

        min_num=    min(min_num,dp[i]);
            /* code
        }


    std::cout << min_num << std::endl;
      */
    return 0;
}