#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__array_ave_step3
#コメント：
#コード：
#```py
n=int(input())
a=list(map(int,input().split()))
k=sum(a)/n
for i in filter(lambda x: x >=k , a):
    print(i)
#```