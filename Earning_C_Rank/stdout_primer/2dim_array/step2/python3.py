#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__2dim_array_step2
#コメント：
#コード：
#```py
s=input().split()
n=3
for i in range(n):
    for j in range(n):
        print(s[i*3+j],end=( " " if j<n-1 else "\n"  ))
#```