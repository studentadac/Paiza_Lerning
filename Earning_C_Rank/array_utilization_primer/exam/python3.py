#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__exam
#コメント：
#コード：
#```py
n=int(input())
m=list(map(int,input().split()))

a=[0]*n
for i in  range(n):
    A=[int(x)  for x in input().split() ]
    a[i]=  sum([j*k  for j,k in zip(m,A)    ])

print(max(a))
#```