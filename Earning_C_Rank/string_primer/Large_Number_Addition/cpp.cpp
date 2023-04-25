#include <algorithm>
#include <iostream>
#include <string>
using namespace std;
int main(void) {
    string s, t;
    std::cin >> s >> t;
    reverse(s.begin(), s.end());
    reverse(t.begin(), t.end());
    int ketaagari = 0;
    string ans = "";
    for (int i = 0; i < s.size(); i++) {
        /* code */
        int sum = (int(s[i] - '0') + (t[i] - '0') + ketaagari);
        //   std::cout<<"sum=" << sum << std::endl;
        int a = sum % 10;
        //   std::cout<<"a=" << a << std::endl;

        ans += to_string(a);
        ketaagari = sum / 10;
        //   std::cout<<"ketaagari=" << ketaagari << std::endl;
    }


    if (ketaagari == 1)
        ans += "1";


    reverse(ans.begin(), ans.end());
    std::cout << ans << std::endl;

    return 0;
}
