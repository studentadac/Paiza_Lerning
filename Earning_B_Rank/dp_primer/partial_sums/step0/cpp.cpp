//言語：cpp
//問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_partial_sums_step0
//コメント：setで全要素列挙
//コード：
//```cpp
#include <iostream>
#include<set>
#include<vector>
using namespace std;
int main(void) {

    int n, x;
    std::cin >> n >> x;

    std::set<int> s;
    s.insert(0);

    for (int i = 0; i < n; i++) {

        int a; std::cin >> a;

        //   std::cout << a << std::endl;
        std::vector<int>v;
        for (auto i : s) {
            v.push_back(i + a);
        }


        //  const int v_size=v.size();
        for (auto i : v) {
            s.insert(i);
        }
    }

    /*for (auto i : s) {
     std::cout << i << std::endl;
    }

    std::cout << s.size() << std::endl;
    */

    decltype(s)::iterator it = s.find(x);
    if (it != s.end()) { // 見つかった
        puts("yes");
    }
    else puts("no");
   
    return 0;
}

//```