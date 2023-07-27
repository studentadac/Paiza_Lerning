//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/stdin/stdin_n
//コメント：
//コード：
//```c

#include <stdio.h>
int main(void)
{
    int n;

    scanf("%d", &n);


    char str[n][101];
    for (int i = 0; i < n; i++)
    {
        scanf("%s", str[i]);
        printf("%s\n", str[i]);

    }

    return 0;
}
//```