//言語：C言語
//問題URL:  https://paiza.jp/works/mondai/stdin/stdin_comma_3
//コメント：
//コード：
//```c

#include <stdio.h>
#include <string.h>
int main(void)
{


    char str[303];
    fgets(str, sizeof(str), stdin);

    char* p = strtok(str, ",");

    do
    {
        puts(p);
        p = strtok(NULL, ",");
    } while (p != NULL);


    return 0;
}
//```