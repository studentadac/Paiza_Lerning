#include <iostream>
using namespace std;
int main(void) {

    int n; std::cin >> n;
    int a[n][2];
    for (int j = 0; j < 2; j++)
    {
        for (int i = 0; i < n; i++) {
            std::cin >> a[i][j];
        }
    }


    for (int i = 0; i < n; i++) {
        /* code */
        std::cout << a[i][1] - a[i][0];
        if (i < n - 1)
        {
            cout << " ";
        }
        else
        {
            puts("");
        }

    }


    return 0;
}
