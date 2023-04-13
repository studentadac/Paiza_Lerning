#include <iostream>
using namespace std;
int main(void) {
    int n; double k;
    std::cin >> n >> k;
    int i_k = 10 * k;
    double a[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
        /* code */
        std::cin >> a[i];
        sum += a[i] * 10;
    }

    int ans = (sum + i_k - 1) / i_k;

    std::cout << ans << std::endl;
    return 0;
}
