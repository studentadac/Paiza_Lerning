#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step2
#コメント：
#```rb
a,b,c = gets.chomp.split(' ')


ans= "(#{b}, #{c}), "  *a.to_i

puts(ans.chop.chop)
#```