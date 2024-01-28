#言語：python3
#問題URL：https://paiza.jp/works/mondai/string_primer/normal_step2
#コメント：
#```py
a=list(input())
b=list(input())
n=int(input())

a[n:n]=b
print(*a,sep="")
#```