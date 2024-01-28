#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step4
#コメント：
#コード：
#```py
n=int(input())
a=[i+1 for i in range(100)]
m=list(map(int,input().split()))
for i in range(n):
    print(*a[:m[i]])
#```