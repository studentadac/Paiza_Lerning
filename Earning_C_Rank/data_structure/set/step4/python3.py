#言語：python3
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_step4
#コメント：
#```py
n=int(input())

a=tuple(input().split())

s=set()
s.add(a[0])

for i in range(1,n):
    if a[i] in s:
        print("Yes")
    else:
        print("No")
        s.add(a[i])
#```