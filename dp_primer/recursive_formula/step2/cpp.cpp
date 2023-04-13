#include <iostream>
using namespace std;
int main(void) {

    int x, d_1, d_2, k;
    std::cin >> x >> d_1 >> d_2 >> k;
    int a[k];
    a[0] = x;
    for (int i = 1; i < k; i++) {
        //  i%2==1?a[i]=a[i-1]+d_2:a[i]=a[i-1]+d_1;
           /* code */
        a[i] = a[i - 1] + (i % 2 == 1 ? d_2 : d_1);
    }
    std::cout << a[k - 1] << std::endl;
    return 0;
}