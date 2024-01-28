#言語：python3
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_step2
#コメント：
#```py
from collections import Counter
n=int(input())

a=Counter(list(input()))

b=[a[ chr(ord('a')+i)] for i in range(26)]

print(*b)


#```