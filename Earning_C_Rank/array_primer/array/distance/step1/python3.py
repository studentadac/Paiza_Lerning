#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__array_distance_step1
#コメント：
#コード：
#```py
n=int(input())
for _ in range(n):
    x=list(map(int,input().split()))
    
    print(abs(x[0]-2)+abs(x[1]-3))
#```