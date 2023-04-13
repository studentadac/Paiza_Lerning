#include <iostream>
#include<map>
using namespace std;
int main(void) {
    int n;
    std::cin >> n;
    std::map<int, int> a;
    for (int i = 0; i < n; i++) {
        int x;
        std::cin >> x;
        a[x];
    }


    string ans = "";
    for (const auto& [key, value] : a) {
        ans += to_string(key) + " ";
    }
    ans.pop_back();
    std::cout << ans << std::endl;

    return 0;
}
