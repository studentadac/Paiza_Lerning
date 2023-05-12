//言語：cpp
//問題URL：https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_snake_move_boss
//コメント：
//コード：
//```cpp
#include <iostream>
using namespace std;
int main(void) {
    int x, y, n;
    std::cin >> x >> y >> n;

    char cardinal = 'N';
    for (int i = 0; i < n; i++) {

        char direction;
        std::cin >> direction;

        if (cardinal == 'N')
        {
            if (direction == 'L')
            {
                cardinal = 'W';
                x--;
            }
            else
            {  
                x++;
                cardinal = 'E';
            }
        }

        else  if (cardinal == 'S')
        {
            if (direction == 'R')
            {
                cardinal = 'W';
                x--;
            }
            else
            {
                x++;
                cardinal = 'E';
            }
        }
        else    if (cardinal == 'E')
        {
            if (direction == 'L')
            {
                cardinal = 'N';
                y--;
            }
            else
            {
                cardinal = 'S';
                y++;
            }
        }

        else    if (cardinal == 'W')
        {
            if (direction == 'R')
            {
                cardinal = 'N';
                y--;
            }
            else
            {
                cardinal = 'S';
                y++;
            }
        }

        std::cout << x << " " << y << std::endl;
    }
    return 0;
}

//```