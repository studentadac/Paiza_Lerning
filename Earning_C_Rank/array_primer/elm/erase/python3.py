#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__elm_erase
#コメント：
#コード：
#```py
n,m=map(int,input().split())
m-=1
a=list(map(int,input().split()))

del a[m]
print(*a,sep="\n")
#```