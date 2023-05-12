#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__split_input_step2
#コメント：
#コード：
#```py
# coding: utf-8
x= input().strip().split()#入力を整形してリスト化

print(*x,sep="\n")#要素のみを出力
#```