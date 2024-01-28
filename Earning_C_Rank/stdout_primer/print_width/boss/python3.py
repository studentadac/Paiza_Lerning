#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__print_width_boss
#コメント：
#コード：
#```py
n,m=map(int,input().split())
for i in range(n):
    a=int(input())
    print("{: >{}}".format(a, m))
#```