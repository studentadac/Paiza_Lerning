#言語：python3
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_step3
#コメント：https://www.lifewithpython.com/2013/01/python-sort-dicts.html https://qiita.com/apollo_program/items/165fb01b52702274936c
#```py
from collections import defaultdict
d = defaultdict(int)



n=int(input())

for _ in range(n):
    s=input()
    d[s]+=1
    
a=sorted(d.items(), key=lambda x: x[0])

for ans in a:
    print(*ans)

#```