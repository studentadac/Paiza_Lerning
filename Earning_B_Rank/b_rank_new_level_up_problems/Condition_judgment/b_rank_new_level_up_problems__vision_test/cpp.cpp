#include <bits/stdc++.h>
using namespace std;
#define rep(i, n) for (int i = 0; i < (int)(n); i++)
int main(void) {
    int n;
    std::cin >> n;
    int ng_cnt[4], ok_cnt[4];//AからDのテストの結果のカウンタ
    rep(i, 4)//ゼロ埋め
    {
        ng_cnt[i] = 0;
        ok_cnt[i] = 0;
    }


    char ans = 'E';//デフォルト
    rep(i, n)
    {
        string test_rank, result;//視力検査の種類と結果
        std::cin >> test_rank >> result;


        //.  std::cout <<int(test_rank[1]-'A') << std::endl;

        int   char_idx = int(test_rank[1] - 'A');//カウンタ格納変数
        if (result == "ok")
        {
            ok_cnt[char_idx]++;
        }
        else if (result == "ng")
        {
            ng_cnt[char_idx]++;

        }
        bool  passed = ok_cnt[char_idx] == 2 && ng_cnt[char_idx] < 2;//テストに２回通ってかつその時点で不合格が2未満か

        bool isLowerAlphabet = char_idx < int(ans - 'A');//今ansが保持しているアルファベットより小さい数か


        if (passed && isLowerAlphabet)
        {
            ans = test_rank[1];

        }


    }


    std::cout << ans << std::endl;
    return 0;
}