#言語：python3
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_step4
#コメント：
#```py
from collections import defaultdict
d = defaultdict(lambda:-1)


n,m=map(int,input().split())
for _ in range(n):
    item=input().split()
    d[item[0]]=int(item[1])

for _ in range(m):
    name=input()
    price=d[name]
    print(price)
#```