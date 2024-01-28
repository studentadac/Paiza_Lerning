#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__fibo
#コメント：
#コード：
#```py
a=[0,1]
for i in range(10):
    a.append(a[i]+a[i+1]  )
n=int(input())

print(*a[:n],sep="\n")
   
#```