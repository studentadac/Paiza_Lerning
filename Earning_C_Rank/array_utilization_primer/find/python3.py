#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__find
#コメント：
#コード：
#```py
n,k=map(int,input().split())
a=[int(input()) for _ in range(n)]

print(     a.index(k)+1  if k in a else -1 )
#```