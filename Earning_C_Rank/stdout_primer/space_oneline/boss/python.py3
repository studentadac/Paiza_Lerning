
#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__space_oneline_boss
#コメント：
#コード：
#```py
s=""
for i in range(1000):
    s+=str(i+1)+' '

print(s[:len(s)-1])
#```