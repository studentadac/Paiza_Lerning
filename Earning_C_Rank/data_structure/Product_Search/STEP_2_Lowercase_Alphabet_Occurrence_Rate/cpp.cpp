#include <iostream>
#include<map>
#include <string>
using namespace std;
int main(void) {
    int n;
    std::cin >> n;
    std::map<char, int> tizu;
    for (int i = 0; i <= 25; i++)
    {
        tizu[char('a' + i)];
        //  cout<<char('a'+i);
    }


    for (int i = 0; i < n; i++) {
        /* code */
        char x; std::cin >> x;
        tizu[x]++;

    }
    string ans = "";
    for (const auto& [key, value] : tizu) {
        ans += to_string(value) + " ";

    }
    ans.pop_back();
    std::cout << ans << std::endl;

    return 0;
}
