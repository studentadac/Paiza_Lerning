#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_input_step4
#コメント：
#```py
n,m=map(int,input().split())
a=[input().split()  for _ in range(n)]


for matrix in a:
    print(*matrix)
#```