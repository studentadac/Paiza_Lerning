#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step4
#コメント：
#コード：
#```py
h,w,a,b=input().split()
block=f"({a}, {b})"
ans=[block]*int(w)
line=" | ".join(ans)
lenLine=len(line)
sep="="*lenLine

H=int(h)
for i in range(H):
    print(line)
    if(i<H-1):
        print(sep)
#```