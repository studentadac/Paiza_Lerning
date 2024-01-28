#言語：python3
#問題URL：https://paiza.jp/works/mondai/arithmetic_substitution_op/arithmetic_substitution_op__arithmetic_step4
#コメント：
#```py
def squared (num):
    return num*num

a,b,c=map(int,input().split())
print(squared(a),squared(b)+squared(c))
#```