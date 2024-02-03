#言語：python3
#問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_for_step1
#コメント：
#コード：
#```py
n=int(input())

a= [    y for y in  [int(x) for x in input().split()] if y%3==0 ]

print(len(a))
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_for_step2
#コメント：
#コード：
#```py
n=int(input())
a=[input() for _ in range(n)]

print("YES" if "7" in a else "NO")
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_for_step3
#コメント：
#コード：
#```py
n=int(input())
a=[None]*n

for i in range(n):
    a[i]=int(input())

k=int(input())

print(a.index(k)+1)
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_for_step4
#コメント：
#コード：
#```py
m=int(input())

a=[input() for _ in range(m)]

n=int(input())

b=[input() for _ in range(n)]

import itertools

iterator = itertools.product(range(m),range(n))
for i, j in iterator:
    #print(i,j)
    print("YES" if a[i] in b[j] else "NO")
#```



#言語：python3
#問題URL：https://paiza.jp/works/mondai/c_rank_level_up_problems/c_rank_for_boss
#コメント：
#コード：
#```py
n,m,k=map(int,input().split())

from collections import Counter
for _ in range(n):
    a=Counter(map(int,input().split()))
    print(a[k])
#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



#言語：python3
#問題URL：
#コメント：
#コード：
#```py

#```



