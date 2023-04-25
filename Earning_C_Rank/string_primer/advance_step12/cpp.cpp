#include <algorithm>
#include <iostream>
#include <string>
#include<vector>
using namespace std;
int main(void) {
    // 自分の得意な言語で
    // Let's チャレンジ！！
    string s;
    int t;

    std::cin >> s >> t;
    if (t == 0)
    {
        puts("0");
        return 0;
    }
    reverse(s.begin(), s.end());

    string ans = "";
    const int  s_length = s.length();
    int ketaagari = 0;
    for (int i = 0; i < s_length; i++) {

        int sum = int(s[i] - '0') * t + ketaagari;
        ans += to_string(sum % 10);
        ketaagari = sum / 10;

        /* code */
    }
    if (ketaagari != 0)
    {
        ans += to_string(ketaagari);
    }
    reverse(ans.begin(), ans.end());
    std::cout << ans << std::endl;
    return 0;
}