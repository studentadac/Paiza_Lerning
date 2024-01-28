#言語：python3
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__array_step2
#コメント：
#コード：
#```py
input()

a=tuple(map(int,input().split()))

input()

b=tuple(map(lambda x: int(x)-1,input().split()))

for num in b:
    print(a[num])
#```