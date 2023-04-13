#include <iostream>
#include<map>
using namespace std;
int main(void) {

    std::map<int, int> dict;
    int n;
    std::cin >> n;
    for (int i = 0; i < n * 2; i++) {
        int x;
        std::cin >> x;
        dict[x];
    }
    string ans = "";
    for (const auto& [key, value] : dict) {
        ans += to_string(key) + " ";
    }
    ans.pop_back();
    std::cout << ans << std::endl;

    return 0;
}
