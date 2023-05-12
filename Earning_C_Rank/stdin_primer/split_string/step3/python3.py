#言語：python3
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__split_string_step3
#コメント：
#コード：
#```py
# coding: utf-8

hello = "one two three four five"

x= hello.split()#リスト化

print(*x,sep="\n")#要素のみを出力
#```