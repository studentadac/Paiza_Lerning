#include <iostream>
#include <iostream>

int gcd(long a, long b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}
long lcm(long a, long b)
{
    return((a * b) / gcd(a, b));

}

using namespace std;
int main(void) {
    long a, b;
    std::cin >> a >> b;

    std::cout << lcm(a, b) << std::endl;
}