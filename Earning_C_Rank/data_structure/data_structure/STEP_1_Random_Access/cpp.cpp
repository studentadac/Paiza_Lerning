#include <iostream>
using namespace std;
int main(void) {
    int  m;
    std::cin >> m >> m;
    int a[m];
    for (int i = 0; i < m; i++) {
        std::cin >> a[i];
    }
    std::cout << a[--m] << std::endl;
    return 0;
}
