
#include <iostream>
#include<cmath>
int gcd(long a, long b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}

using namespace std;
int main(void) {
    long a, b, c;
    std::cin >> a >> b >> c;
    bool is_swap = false;
    if (a < b)
    {
        swap(a, b);
        is_swap = true;
    }
    int y = -(a - c) / b;
    int x = 1;

    if (is_swap)
        swap(x, y);

    std::cout << x << " " << y << std::endl;
}
