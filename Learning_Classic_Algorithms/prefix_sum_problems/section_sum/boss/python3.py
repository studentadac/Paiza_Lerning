#言語：python3
#問題URL：https://paiza.jp/works/mondai/prefix_sum_problems/prefix_sum_problems__section_sum_boss
#コメント：
#コード：
#```py
n,x,y=map(int,input().split())
a=tuple(map(int,input().split()))
# s を初期化
s = [0] * (n+1)


for i in range(n):
    s[i+1]=s[i]+a[i]

print(s[y+1]-s[x])
#```