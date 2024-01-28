#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__map
#コメント：
#コード：
#```py
n,k=map(int,input().split())
a=[int(input())+k for _ in range(n)]

print(*a,sep="\n")
#```