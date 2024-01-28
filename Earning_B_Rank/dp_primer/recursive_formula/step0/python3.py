#言語：python3
#問題URL：https://paiza.jp/works/mondai/dp_primer/dp_primer_recursive_formula_step0
#コメント：
#コード：
#```py
x,d,k=map(int,input().split())

a=[0]*k

a[0]=x
for i in range(k-1):
    a[i+1]=a[i]+d
    
print(a[-1])
#```