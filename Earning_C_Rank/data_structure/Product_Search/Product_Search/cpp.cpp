#include <iostream>
#include<map>
using namespace std;
int main(void) {
    int n, q;
    std::cin >> n >> q;
    std::map<string, int> x;
    for (int i = 1; i <= n; i++) {
        string key;
        std::cin >> key;
        // x[key];
        if (x[key] == 0)
        {
            x[key] = i;
        }
        //    std::cout << x[key] << std::endl;
    }
    for (int i = 0; i < q; i++) {
        string key;
        std::cin >> key;
        if (x[key] != 0)
            cout << x[key] << endl;
        else
            puts("-1");
    }
    return 0;
}
