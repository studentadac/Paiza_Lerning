#include <bits/stdc++.h>
using namespace std;
#define rep(i, n) for (int i = 0; i < (int)(n); i++)

class employee
{
    string name;
    int number;
public:
    employee(int number, string name) : number(number), name(name) {}
    void getnum()
    {
        std::cout << number << std::endl;
    }


    void getname()
    {
        std::cout << name << std::endl;
    }
    void change_num(int num)
    {
        number = num;
    }
    void change_name(string namae)
    {
        name = namae;
    }

};
int main(void) {
    int n;
    std::cin >> n;

    std::vector<employee> vec;
    rep(i, n)
    {

        string s;
        int num;
        std::cin >> s >> num;
        //     std::cout << s<<num << std::endl;
        if (s == "make")
        {
            string s2;
            std::cin >> s2;
            auto a = employee(num, s2);

            vec.push_back(a);
        }
        else if (s == "getnum")
        {
            // cout<<vec[n-1].name<<endl;

            vec[num - 1].getnum();
        }
        else if (s == "getname")
        {
            vec[num - 1].getname();
        }
        else if (s == "change_name")
        {
            string s2;
            std::cin >> s2;
            vec[num - 1].change_name(s2);

        }
        else {
            int  s2;
            std::cin >> s2;
            vec[num - 1].change_num(s2);

        }

    }

    return 0;
}