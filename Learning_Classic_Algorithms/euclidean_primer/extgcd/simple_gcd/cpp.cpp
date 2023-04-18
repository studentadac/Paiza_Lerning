#include <iostream>

using namespace std;
int main(void) {
    int a, b;
    std::cin >> a >> b;

    while (b > 0)
    {
        int num_max = max(a, b);
        int num_min = min(a, b);

        num_max %= num_min;//num_min>nummax

        a = num_min;//a>b
        b = num_max;
    }

    std::cout << a << std::endl;


    return 0;
}