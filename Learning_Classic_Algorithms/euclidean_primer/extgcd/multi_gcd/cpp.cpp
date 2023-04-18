#include <iostream>

int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}



using namespace std;
int main(void) {
    int n;
    std::cin >> n;
    int a[n];

    for (int i = 0; i < n; i++) {
        std::cin >> a[i];
    }

    for (int i = 0; i < n - 1; i++) {
        a[i + 1] = gcd(a[i], a[i + 1]);
    }
    std::cout << a[n - 1] << std::endl;
}