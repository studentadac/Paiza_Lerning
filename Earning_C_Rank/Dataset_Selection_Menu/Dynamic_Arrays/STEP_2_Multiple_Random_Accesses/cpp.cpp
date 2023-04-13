#include <iostream>
using namespace std;
int main(void) {

    int n;
    std::cin >> n;
    int a[n];
    for (int i = 0; i < n; i++) {
        
        std::cin >> a[i];
    }
    int q;
    std::cin >> q;
    int b[q];
    for (int i = 0; i < q; i++) {
        std::cin >> b[i];
        cout << a[--b[i]] << endl;
        /* code */
    }
    return 0;
}
