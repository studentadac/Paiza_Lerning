#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_boss
#コメント：
#コード：
#```py
n,m=map(int,input().split())

a=list(map(int,input().split()))
b=list(map(int,input().split()))

start=0
for i in b:
    print(*a[start:start+i])
    start+=i
#```