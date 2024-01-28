#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__swap
#コメント：
#コード：
#```py
n = int(input())
a=[int(input()) for _ in range(n)]
x,y=map(lambda x: int(x)-1 ,input().split())
a[x],a[y]=a[y],a[x]
print(*a,sep="\n")
#```