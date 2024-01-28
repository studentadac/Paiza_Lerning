#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_input_step2
#コメント：
#```py
m=int(input())
a=[input().split()  for _ in range(5)]


for matrix in a:
    print(*matrix)
#```