#言語：python3
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_step1
#コメント：
#```py
from collections import Counter
n=int(input())

a=Counter(input().split())

b=[a[str(i)] for i in range(10)]

print(*b)

#```