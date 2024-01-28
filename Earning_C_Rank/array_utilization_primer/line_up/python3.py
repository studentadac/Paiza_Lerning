#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__line_up
#コメント：
#コード：
#```py
n,k,f=map(int,input().split())
A=[None]*k
for i in range(k):
    A[i]=int(input())

afterA=A[f:]
#print(afterA)
s=set()

for i in afterA:
    if i not in s:
        print(i)
        s.add(i)
    
    
#```