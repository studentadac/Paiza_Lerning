#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__format_real_number_step4
#コメント：
#コード：
#```py
n,m=input().split()
print(f"%.{int(m)}f" % float(n)  )
#```