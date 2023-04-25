#include <iostream>

using namespace std;
int main(void) {
    int a[3];
    int min = 100, max = 0;
    for (int i = 0; i < 3; i++) {

        std::cin >> a[i];
        if (a[i] > max)
        {
            max = a[i];
        }
        if (a[i] < min)
        {
            min = a[i];
        }
    }
    std::cout << max - min << std::endl;
    return 0;
}
