#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__2dim_array_boss
#コメント：
#コード：
#```py
n=int(input())
for i in range(n):
    for j in range(n):
        print((i+1)*(j+1),end=( " " if j<n-1 else "\n"  ))
#```