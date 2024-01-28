#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__exist
#コメント：
#コード：
#```py
n,k=map(int,input().split())
a=[int(input()) for _ in range(n)]

print("Yes" if k in a else "No")
#```