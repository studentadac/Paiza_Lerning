#言語：python3
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_boss
#コメント：
#```py
from collections import defaultdict
d = defaultdict(lambda:-1)


n,q=map(int,input().split())
for i in range(n):
    item=input()
    if d[item]==-1:
        d[item]=i+1

for _ in range(q):
    name=input()
    number=d[name]
    print(number)
#```