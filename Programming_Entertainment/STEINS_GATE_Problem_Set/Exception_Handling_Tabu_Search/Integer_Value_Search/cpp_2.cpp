#include <iostream>
using namespace std;
int main(void) {
    int n;
    std::cin >> n;
    int a[n];
    for (int i = 0; i < n; i++) {

        std::cin >> a[i];
    }
    int x;
    std::cin >> x;
    for (int i = 0; i < n; i++) {
        /* code */
        if (x == a[i])
        {
            std::cout << i + 1 << std::endl;
            break;
        }
    }

    return 0;
}
