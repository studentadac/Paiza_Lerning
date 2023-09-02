#言語：ruby
#問題URL：https://paiza.jp/works/mondai/string_primer/normal_step3
#コメント: 
#```rb
s=gets.chomp
a,b=gets.split(" ")

a=a.to_i-1
s[a]=b

puts s
#```