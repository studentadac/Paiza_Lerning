#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__queue
#コメント：
#コード：
#```py
from collections import deque
A=deque()
n=int(input())

for _ in range(n):
    s=input()
    if s=="out":
        if A:
            A.popleft()
    else:
        A.append(s.split()[1])

print(*A,sep="\n")
#```