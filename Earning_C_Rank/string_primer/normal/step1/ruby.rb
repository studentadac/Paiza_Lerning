#言語：ruby
#問題URL：https://paiza.jp/works/mondai/string_primer/normal_step1
#コメント: 
#```rb
S=gets.chomp
a,b=gets.split(" ").map(&:to_i)

a-=1
puts S.slice(a,b-a)
#```