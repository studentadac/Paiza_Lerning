#言語：python3
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_step3
#コメント：
#```py
n=int(input())

a=tuple(map(int,input().split()))

s=set()
s.add(a[0])

for i in range(1,n):
    if a[i] in s:
        print("Yes")
    else:
        print("No")
        s.add(a[i])
#```