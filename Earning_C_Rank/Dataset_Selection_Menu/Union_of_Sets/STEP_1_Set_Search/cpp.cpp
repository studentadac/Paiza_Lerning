#include <iostream>
#include<map>
using namespace std;
#include <iostream>
#include<set>
using namespace std;
int main(void) {
    int n, b;
    std::cin >> n >> b;
    std::set<int> s;
    for (int i = 0; i < n; i++) {
        int a;
        std::cin >> a;
        s.insert(a);
    }
    if (0 < s.count(b))
    {
        puts("Yes");
    }
    else
    {
        puts("No");
    }
    return 0;
}
