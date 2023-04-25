#include <iostream>
using namespace std;
int main(void) {
    int h, w, r, c;
    std::cin >> h >> w >> r >> c;
    string a[h];
    for (int i = 0; i < h; i++) {
        std::cin >> a[i];
    }

    if (a[--r][--c] == '#')
    {
        puts("Yes");
    }
    else
    {
        puts("No");
    }
    return 0;
}
