#include <iostream>
using namespace std;
int main(void) {
    int n;
    cin >> n;
    int a[10] = { 0 };
    for (int i = 0; i < n; i++) {

        int x; std::cin >> x;
        a[x]++;
        /* code */
    }

    for (int i = 0; i < 10; i++) {
        /* code */
        std::cout << a[i];
        if (i < 9)
            std::cout << " ";
    }
    puts("");
    return 0;
}
