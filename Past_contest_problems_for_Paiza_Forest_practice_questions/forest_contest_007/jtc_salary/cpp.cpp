//言語：cpp
//問題URL：https://paiza.jp/works/mondai/forest_contest_007/forest_contest_007__jtc_salary
//コメント：
//コード：
//```cpp
#include <iostream>
using namespace std;
int main(void) {

    int x[25];
    x[0] = 0;
    int a, b, c;
    std::cin >> a >> b >> c;
    for (int i = 1; i < 25; i++) {
        x[i] = b * int((i) / 5) + a;
        //std::cout << i <<" "<<x[i]<< std::endl;

    }

    std::cout << x[c] << std::endl;


    return 0;
}
//```