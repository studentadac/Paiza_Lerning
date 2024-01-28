#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_i-thoutput_step2
#コメント：
#```py
k,l=map(lambda x: int(x)-1, input().split())
b=[input().split()  for _ in range(3)  ]
print(b[k][l])
#```