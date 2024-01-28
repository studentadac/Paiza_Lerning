#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__count
#コメント：
#コード：
#```py
n,k=input().split()

print(  [input() for _ in range(int(n))   ]    .count(k))
   
#```