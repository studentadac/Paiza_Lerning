#include <iostream>
using namespace std;
int main(void) {


    string a, b;
    std::cin >> a >> b;
    for (int i = 0; i < a.length(); i++)
    {
        cout << int(a[i] - '0') + int(b[i] - '0');
    }
    puts("");
    return 0;
}
