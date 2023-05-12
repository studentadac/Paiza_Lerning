#include <iostream>
using namespace std;
int main(void) {

    int x, d_1, d_2, q;
    std::cin >> x >> d_1 >> d_2 >> q;
    int k[q];

    int max = 0;
    for (int i = 0; i < q; i++) {

        std::cin >> k[i];
        /* code */
        max = max < k[i] ? k[i] : max;
    }

    int a[max];
    a[0] = x;

    for (int i = 1; i < max; i++) {
        /* code */
        a[i] = a[i - 1];
        a[i] += i % 2 == 0 ? d_1 : d_2;
    }

    for (int i = 0; i < q; i++) {
        /* code */
        std::cout << a[k[i] - 1] << std::endl;
    }


    return 0;
}