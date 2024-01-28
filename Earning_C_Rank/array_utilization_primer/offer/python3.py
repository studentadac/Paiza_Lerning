#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__offer
#コメント：
#コード：
#```py
n,k,m=map(int,input().split())

a=[]

for _ in range(n):
    num=int(input())
    if num>=k:
        a.append(num)

print(max(0, len(a)-m ))
#```