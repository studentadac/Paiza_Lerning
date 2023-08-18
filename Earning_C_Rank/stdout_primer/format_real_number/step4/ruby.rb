#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__format_real_number_step４
#コメント：
#```rb
n,m = gets.split(" ")
n=n.to_f
#m=m.to_i
puts sprintf("%.#{m}f",n)
#```