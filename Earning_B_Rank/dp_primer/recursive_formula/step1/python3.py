#言語：python3
#問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_recursive_formula_step1
#コメント：
#コード：
#```py
x,d=map(int,input().split())
q=int(input())
a=[0]*1000

a[0]=x
for i in range(999):
    a[i+1]=a[i]+d
    
for i in range(q):
    n=int(input())-1
    print(a[n])
#```