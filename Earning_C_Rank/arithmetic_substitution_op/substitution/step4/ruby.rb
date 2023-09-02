#言語：ruby
#問題URL：https://paiza.jp/works/mondai/arithmetic_substitution_op/arithmetic_substitution_op__substitution_step4
#コメント: 
#```rb
a,b=gets.split(" ").map(&:to_i)

n= (10_000 / a) %b 
p n
#```