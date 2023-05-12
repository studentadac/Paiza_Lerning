#include <iostream>
using namespace std;
int main(void) {

    int k;
    std::cin >> k;
    const int lim = 40;
    int a[lim];
    a[0] = 1;
    a[1] = 1;
    // int ans = 0;


    for (int i = 2; i < lim; i++) {
        /* code */
        a[i] = a[i - 1] + a[i - 2];

    }
    for (int i = 0; i < k; i++) {
        int x; std::cin >> x;
        cout << a[x - 1] << endl;

    }

    return 0;
}