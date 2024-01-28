#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__2dmatrix_output_step1
#コメント：ジャグ配列の場合も考慮
#```py
a=["1 2 3 4 5 6".split(),"8 1 3 3 1 8".split()]

ans=0
for i in a:
    ans+=len(i)
print(ans)
#```