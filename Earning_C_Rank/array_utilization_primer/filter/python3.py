#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__filter
#コメント：
#コード：
#```py
n, k = map(int, input().split())
a = [int(input()) for _ in range(n) ]
b=[x for x in a if x>=k]
print(*b,sep="\n")
#```