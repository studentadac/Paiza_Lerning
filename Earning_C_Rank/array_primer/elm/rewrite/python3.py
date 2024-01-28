#言語：python3
#問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__elm_rewrite
#コメント：gpt
#コード：
#```py
A, b, n = input().split()
a = input().split()

# mapとlambdaを使用して変換を行う
b_list = list(map(lambda x: b if x == A else x, a))

print(*b_list,sep="\n")
#```