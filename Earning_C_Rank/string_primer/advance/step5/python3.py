#言語：python3
#問題URL：https://paiza.jp/works/mondai/string_primer/advance_step5
#コメント：
#```py
s=input()
a=set()

for num in s:
    if num not in a:
        print(num,end="")
        a.add(num)
    if len(num)>=10:
        exit()
#```
