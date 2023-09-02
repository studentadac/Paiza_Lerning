#言語：ruby
#問題URL：https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_step5
#コメント: 
#```rb
a,b=gets.split(" ").map(&:to_i)
ans= 1^(a & b)
p ans
#```