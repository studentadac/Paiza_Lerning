#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__insert
#コメント：
#コード：
#```py
n = int(input())
a=[int(input()) for _ in range(n)]
n,b=map(int ,input().split())


a.insert(n,b)

print(*a,sep="\n")
#```