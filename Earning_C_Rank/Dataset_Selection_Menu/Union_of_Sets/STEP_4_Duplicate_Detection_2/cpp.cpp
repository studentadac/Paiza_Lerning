#include <iostream>
#include<set>
using namespace std;
int main(void) {
    int n;
    std::cin >> n;
    std::set<string> s;
    string b[n];

    for (int i = 0; i < n; i++) {
        std::cin >> b[i];
    }

    s.insert(b[0]);
    for (int i = 1; i < n; i++) {
        std::cin >> b[i];
        if (s.count(b[i]) > 0)
        {
            puts("Yes");
        }
        else
        {
            puts("No");
        }
        s.insert(b[i]);
    }
    return 0;
}
