#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step3
#コメント：
#コード：
#```py
for i in range(1,10):
    a=[None]*9
    for j in range(1,10):
        a[j-1]=   f"{i*j: >2}"  
    print(" | ".join(a))
    if(i<9):
        print("="*42)
#```