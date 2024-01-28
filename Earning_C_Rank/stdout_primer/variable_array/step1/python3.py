#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step1
#コメント：
#コード：
#```py
n=int(input())

for i in range(n):
    print(i+1,end=("\n" if( ((i+1)*2)%n==0 ) else " "))
#```