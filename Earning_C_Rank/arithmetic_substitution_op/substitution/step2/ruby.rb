#言語：ruby
#問題URL：https://paiza.jp/works/mondai/arithmetic_substitution_op/arithmetic_substitution_op__substitution_step2
#コメント: 
#```rb
# 自分の得意な言語で
# Let's チャレンジ！！
#変数 N を 0 で初期化する
n,b,c=gets.split(" ").map(&:to_i)

#N に A を足した値を N へ代入する
#N に B をかけた値を N へ代入する
n*=b
#N を C で割ったあまりを N へ代入する
n%=c
#N を出力する
puts n
#```