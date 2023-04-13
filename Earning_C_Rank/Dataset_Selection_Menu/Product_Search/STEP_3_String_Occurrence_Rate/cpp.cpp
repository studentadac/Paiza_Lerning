#include <iostream>
#include<map>
using namespace std;
int main(void) {
    std::map<string, int> lib;
    int n;
    std::cin >> n;
    for (int i = 0; i < n; i++) {
        string key;
        std::cin >> key;
        lib[key]++;
        /* code */
    }
    for (const auto& [key, value] : lib) {
        std::cout << key << " " << value << std::endl;
    }
    return 0;
}
