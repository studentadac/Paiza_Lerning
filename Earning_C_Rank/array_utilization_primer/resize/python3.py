#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__resize
#コメント：
#コード：
#```py
N,n = map(int,input().split())
a=[0]*n

x=min(n,N)
for i in range(x):
    a[i]=int(input())

print(*a ,sep="\n")       
#```