#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step3
#コメント：
#コード：
#```py
n=int(input())

a=[]
for i in range(n):
    a.append(i+1)
    print(*a)
#```