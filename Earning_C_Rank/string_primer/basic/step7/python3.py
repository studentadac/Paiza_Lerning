#言語：python3
#問題URL：https://paiza.jp/works/mondai/string_primer/basic_step7
#コメント：
#```py
n=int(input())
s=[]
for i in range(n):
    s.extend(list(input()))
    
print("".join(s))
#```