#include <iostream>
using namespace std;
int main(void) {

    int k;
    std::cin >> k;
    int a[2];
    a[0] = 1;
    a[1] = 1;
    int ans = 0;


    for (int i = 2; i < k; i++) {
        /* code */

        ans = a[0] + a[1];
        a[0] = a[1];
        a[1] = ans;


    }
    if (k <= 2) { ans = a[k - 1]; }

    std::cout << ans << std::endl;
    return 0;
}