#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__format_real_number_boss
#コメント：
#```rb
gets
while line=gets
n,m = line.split(" ")
n=n.to_f
#m=m.to_i
puts sprintf("%.#{m}f",n)
end
#```