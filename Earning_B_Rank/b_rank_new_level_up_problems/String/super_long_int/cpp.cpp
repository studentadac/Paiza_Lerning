
//言語：cpp
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__super_long_int
//コメント:
//コード：
//```cpp  

#include <bits/stdc++.h>
#define rep(i, n) for (int i = 0; i < (int)(n); i++)
using namespace std;
int main(void) {
    string num = "";
    std::cin >> num;

    long long ans = 0;

    for (int i = 0; i < 4; i++) {
        string split_s = "";//４分割するための空文字列
        for (int j = i * 8; j < (i * 8) + 8; j++)//j=0,8,16,24,j<j+8
        {
            split_s += num[j];
            //   std::cout << j << std::endl;
        }
        //   cout<<split_s<<endl;
        ans += stoi(split_s);//文字列を数値に変換して加算


    }



    cout << ans << endl;

    return 0;
}


//```