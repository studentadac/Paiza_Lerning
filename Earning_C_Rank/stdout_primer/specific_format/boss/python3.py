#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_boss
#コメント：
#コード：
#```py
h,w,a,b=map(int,input().split())
block=f"({a: >9}, {b: >9})"
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