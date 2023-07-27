//言語：cpp
//問題URL：https://paiza.jp/works/mondai/ppg_sl_cpp/ppg_sl_cpp__enjou
//コメント：
//コード：
//```cpp
#include <iostream>

int main() {
    int due;
    std::cin >> due;
    if (due<=3) {
        std::cout << "BOMB" << std::endl;
        exit(0);
    }
    std::cout << "ONGOING" << std::endl;

    return 0;
}
//```