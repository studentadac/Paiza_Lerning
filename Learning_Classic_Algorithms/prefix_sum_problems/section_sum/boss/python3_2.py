#言語：python3
#問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__section_sum_boss
#コメント：https://qiita.com/bluepost59/items/b3d982097b48488ed070
#コード：
#```py
import numpy

n,x,y=map(int,input().split())
a=tuple(map(int,input().split()))
s=  numpy.cumsum(a)
print(s[y]-s[x-1])
#```