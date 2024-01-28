#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__reduce
#コメント：
#コード：
#```py
n = int(input())
a=[int(input()) for _ in range(n)]

for i in range(1,n):
    for j in range(i):
        print(a[i]*a[j])
        
#```