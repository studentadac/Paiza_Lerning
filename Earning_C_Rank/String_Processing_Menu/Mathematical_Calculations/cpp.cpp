#include <iostream>
#include<vector>
using namespace std;
int main(void) {
    // 自分の得意な言語で
    // Let's チャレンジ！！
    string s;
    getline(cin, s);
    string num = "";
    std::vector<int> a;
    string kigou = "";
    for (int i = 0; i < s.length(); i++) {
        /* code */

        if ('0' <= s[i] && s[i] <= '9')
        {
            num += s[i];
        }
        else

        {
            kigou += s[i];
            a.push_back(stoi(num));
            //    std::cout << num<< std::endl;
            num = "";
        }
    }
    a.push_back(stoi(num));

    int sum = a[0];

    for (int i = 0; i < kigou.length(); i++) {
        /* code */
        if (kigou[i] == '+')
            sum += a[i + 1];
        else
            sum -= a[i + 1];

    }

    cout << sum << endl;
    return 0;
}