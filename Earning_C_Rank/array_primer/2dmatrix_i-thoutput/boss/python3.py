#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_i-thoutput_boss
#コメント：
#```py
n,m,k,l=map(lambda x: int(x)-1, input().split())
n+=1
b=[input().split()  for _ in range(n)  ]
print(b[k][l])
#```