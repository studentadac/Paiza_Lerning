#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__bowling
#コメント：
#コード：
#```py
a=[]
for _ in range(4):
    b=[x  for x in  input().split()     ]  
    a.extend(b)

s="".join(a[::-1])

print(s.index("1")+1)
print(s.count("1"))
#```