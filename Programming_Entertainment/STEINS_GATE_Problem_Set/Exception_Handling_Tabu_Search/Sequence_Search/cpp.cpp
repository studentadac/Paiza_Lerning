#include <iostream>
#include<map>
using namespace std;
int main(void) {
    int n, m; std::cin >> n >> m;
    string str;
    getline(cin, str);
    std::map<string, int> index;
    string s[n];
    for (int i = 0; i < n; i++) {
        /* code */
        getline(cin, s[i]);
        index[s[i]] = i + 1;
    }
    string x;
    getline(cin, x);
    std::cout << index[x] << std::endl;
    return 0;
}
