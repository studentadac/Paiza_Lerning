#言語：python3
#問題URL：https://paiza.jp/works/mondai/string_primer/advance_step7
#コメント：１万文字程度ならならTLEは大丈夫だろうと計算量を気にせず書いた
#```py
s=list(input())


if "." in s:
    while(s[-1]=="0"):
        s.pop()
        
    s.reverse()
    while(s.count(".")>1):
        del s[s.index(".")]
    s.reverse()
    
    while(s[:2]!=['0', '.'] and s[0]=="0"   ):
        s=s[1:]
        

else:
    while(s[0]=="0"):
        s=s[1:]

print("".join(s))
#```
