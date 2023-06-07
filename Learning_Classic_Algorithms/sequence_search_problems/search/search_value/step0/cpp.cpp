#include <iostream>
using namespace std;
int main(void) {

    int n;
    std::cin >> n;
    int a[n];
    for (int i = 0; i < n; i++) {
        std::cin >> a[i];
        /* code */
    }
    int k;
    std::cin >> k;
    int cnt = 0;
    for (int i = 0; i < n; i++) {

        cnt += (k == a[i] ? 1 : 0);
        /* code */
    }

    std::cout << cnt << std::endl;
    return 0;
}