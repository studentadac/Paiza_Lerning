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
    //   int k;
    //   std::cin >> k;
    int cnt = 0;
    for (int i = 0; i < n; i++) {

        if (a[i] % 2 == 0)
        {
            cnt = i + 1;
            break;
        }

    }

    std::cout << cnt << std::endl;
    return 0;
}