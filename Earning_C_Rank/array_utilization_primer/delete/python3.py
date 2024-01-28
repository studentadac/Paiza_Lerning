#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__delete
#コメント：
#コード：
#```py
n = int(input())
a=[int(input()) for _ in range(n)]

x=int(input())-1

del a[x]
print(*a,sep="\n")
#```