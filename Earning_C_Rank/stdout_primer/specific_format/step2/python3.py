#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step2
#コメント：
#コード：
#```py
n,a,b=input().split()
block=f"({a}, {b})"
ans=[block]*int(n)
print(", ".join(ans))
#```