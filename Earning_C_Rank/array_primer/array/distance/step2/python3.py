#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__array_distance_step2
#コメント：
#コード：
#```py
n,a,b=[int(x)-1 for x in input().split()    ]
n+=1
x=[None]*(n)
for i in range(n):
    x[i]=list(map(int,input().split()))
    
print(abs(x[a][0]-x[b][0])+abs(x[a][1]-x[b][1]))
   
#```