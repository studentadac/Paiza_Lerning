#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_i-thoutput_step1
#コメント：
#```py
a=["1 2 3 4","10 100 0 5","8 1 3 8","15 34 94 25"]

b=[s.split()  for s in a  ]
k,l=map(lambda x: int(x)-1, input().split())
print(b[k][l])
#```