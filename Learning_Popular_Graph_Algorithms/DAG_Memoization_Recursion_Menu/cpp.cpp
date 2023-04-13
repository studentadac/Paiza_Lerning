#include <iostream>
using namespace std;

long long fib2(long long a, long long b, long long c)
{
    if (c < 1)
    {
        return a % 1000000007;
    }
    return fib2((a + b) % 1000000007, a % 1000000007, c - 1);
}
long long fibonacci(long long num)
{
    return fib2(0, 1, num);
}


int main(void)
{

    long long  n; std::cin >> n;
    std::cout << fibonacci(n) << std::endl;
    return 0;
}