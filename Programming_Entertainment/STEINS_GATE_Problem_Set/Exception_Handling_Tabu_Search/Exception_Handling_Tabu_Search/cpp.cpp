#include <iostream>
#include<map>
#include<vector>
#include <string>
using namespace std;
int main(void) {

    int n, m, l;
    std::cin >> n >> m >> l;
    int b[l][m];
    string str;
    getline(cin, str);
    std::map<string, int>  command;


    std::vector<int>a[m];

    for (int i = 1; i <= n; i++) {

        getline(cin, str);
        command[str] = i;
    }


    for (int i = 0; i < l; i++) {

        for (int j = 0; j < m; j++) {

            std::cin >> b[i][j];
            //   std::cout << b[i][j] << " ";
        }
        //  puts("");

    }

    int c[l - 1][m];
    for (int i = 0; i < l - 1; i++)
    {
        string x = "";

        for (int j = 0; j < m; j++) {
            c[i][j] = b[i + 1][j] - b[i][j];
            x += to_string(c[i][j]);
            if (j < m - 1)
            {
                x += " ";
            }
        }
        std::cout << command[x] << std::endl;

    }
    return 0;
}
