#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__unique
#コメント：
#コード：
#```py
s=set()

n=int(input())

for i in range(n):
    a=int(input())
    if not a in s:
        print(a)
        s.add(a)
        
#```