//言語：cpp
//問題URL：https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_camp_step2
//コメント:
//コード：
//```cpp

#include <bits/stdc++.h>
using namespace std;
#define rep(i, n) for (int i = 0; i < (int)(n); i++)
int main(void) {

    int high, wide, y, x;
    std::cin >> high >> wide >> y >> x;

    char board[high][wide];//マス目

    rep(i, high)
        rep(j, wide)
    {
        std::cin >> board[i][j];//入力
    }

    int max_x = x, min_x = x;
    int max_y = y, min_y = y;

    for (int i = 0; i < x; i++) {

        if (board[y][i] == '*')
            min_x = i;//x以外で最も近い数字が代入される


    }


    for (int i = x + 1; i < wide; i++) {

        if (board[y][i] == '*')
        {
            max_x = i;
            break;//xに最も近い=wideから最も遠い
        }


    }



    for (int i = 0; i < y; i++) {

        if (board[i][x] == '*')
            min_y = i;


    }


    for (int i = y + 1; i < high; i++) {

        if (board[i][x] == '*')
        {
            max_y = i;
            break;
        }


    }

    //cout <<min_y<<" "<<max_y<<endl;
    //cout<<min_x<<" "<<max_x<<endl;
    for (int i = min_y; i <= max_y; i++)//求めた範囲を*で塗りつぶす
        board[i][x] = '*';

    for (int i = min_x; i <= max_x; i++)
        board[y][i] = '*';

    rep(i, high)
    {
        rep(j, wide)
        {
            std::cout << board[i][j];
        }
        puts("");
    }

    return 0;
}

//```