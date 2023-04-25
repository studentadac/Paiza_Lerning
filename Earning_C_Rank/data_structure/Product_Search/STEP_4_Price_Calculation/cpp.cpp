#include <iostream>
#include<map>
using namespace std;
int main(void) {
    int n, m;
    std::cin >> n >> m;
    std::map<string, int> items;
    for (int i = 0; i < n; i++) {
        string key;
        int pair;
        std::cin >> key >> pair;
        items[key] = pair;           
    }
    for (int i = 0; i < m; i++) {
        /* code */
        string ans;
        int num;
        std::cin >> ans;
        if (items[ans] != 0)
        {
            num = items[ans];
        }
        else
        {
            num = -1;
        }
        std::cout << num << std::endl;
    }
    return 0;
}
