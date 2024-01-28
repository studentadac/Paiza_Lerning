#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__array_elm_change
#コメント：
#コード：
#```py
A,b,n=map(lambda x: int(x)-1,input().split())


a=input().split()

a[A],a[b]=a[b],a[A]

print("\n".join(a))
#```