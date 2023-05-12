//言語：cpp
//問題URL：https://paiza.jp/works/mondai/skillcheck_sample/fizz-buzz
//コメント：
//コード：
//```cpp
#include <iostream>
using namespace std;

string FizzBuzz(int num)

{
    string s = "";
    if (num % 3 == 0 && num % 5 == 0)
        s = "Fizz Buzz";
    else if (num % 3 == 0)
        s = "Fizz";
    else if (num % 5 == 0)
        s = "Buzz";
    else
        s = to_string(num);

    return s;
}

int main(void) {

    int n; std::cin >> n;
    for (int i = 0; i < n; i++) {
        std::cout << FizzBuzz(i + 1) << std::endl;
    }
}

//```

10213243
001122