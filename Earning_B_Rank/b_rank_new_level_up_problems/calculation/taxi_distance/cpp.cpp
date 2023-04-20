
//言語：cpp
//問題URL：https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__super_long_int
//コメント:
//コード：
//```cpp  

#include <bits/stdc++.h>
#define rep(i, n) for (int i = 0; i < (int)(n); i++)
    using namespace std;



int manlen(int x_1, int y_1, int x_2, int y_2) //マンハッタン距離を求める
{

    return abs(x_1 - x_2) + abs(y_1 - y_2);
}

double eulen(int x_1, int y_1, int x_2, int y_2) //ユークリッド距離を求める
{
    return  sqrt(double((x_1 - x_2) * (x_1 - x_2) + (y_1 - y_2) * (y_1 - y_2)));

}
using namespace std;
int main(void) {
    int p_x, p_y;
    std::cin >> p_x >> p_y;

    int n;
    std::cin >> n;

    //  int man[n];//マンハッタン距離の格納
    //  double eu[n];//ユークリッド距離の格納

    std::vector< pair<double, int> >eu_pair(n);//ユークリッド距離と順番の格納
    std::vector< pair<int, int> >man_pair(n);//マンハッタン以下略
    rep(i, n)
    {
        eu_pair[i].second = i + 1;//順番
        man_pair[i].second = i + 1;

        int x, y;
        std::cin >> x >> y;
        //  man[i]=manlen(x,y,p_x,p_y);
        //   eu[i]=eulen(x,y,p_x,p_y);

        eu_pair[i].first = eulen(x, y, p_x, p_y);//距離を代入
        man_pair[i].first = manlen(x, y, p_x, p_y);



    }

    std::sort(eu_pair.begin(), eu_pair.end());//昇順に整列 firstが等しければsecondで整列

    std::sort(man_pair.begin(), man_pair.end());


    rep(i, 3)//３番目まで昇順に出力
    {
        std::cout << eu_pair[i].second << std::endl;
        // std::cout << eu[i] << std::endl;
    }
    rep(i, 3)
    {
        std::cout << man_pair[i].second << std::endl;
        //  std::cout << man[i] << std::endl;
    }



    return 0;
}

//```
