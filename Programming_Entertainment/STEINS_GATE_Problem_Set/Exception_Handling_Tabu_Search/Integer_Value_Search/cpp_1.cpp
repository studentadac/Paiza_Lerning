#include <iostream>
#include<map>
using namespace std;
int main(void) {
    int n;
    std::cin >> n;
    std::map<int, int> a;

    for (int i = 0; i < n; i++) {
        int num;
        std::cin >> num;
        a[num] = i;
    }
    int x; 
    cin >> x;
    std::cout << a[x] + 1 << std::endl;
}
