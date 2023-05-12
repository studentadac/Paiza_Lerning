#include <iostream>
using namespace std;
int main(void) {

    int x, d, q;
    std::cin >> x >> d >> q;
    int a[1001];
    a[1] = x;
    for (int i = 2; i <= 1000; i++) {
        /* code */
        a[i] = a[i - 1] + d;

    }
    for (int i = 0; i < q; i++) {
        int x;
        std::cin >> x;
        std::cout << a[x] << std::endl;

        /* code */
    }

}