#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step1
#コメント：
#```rb

n=gets.to_i
line = (1..n).to_a
#p(line)
ans=line.each_slice(n/2).to_a
#p(ans)
ans.each do |x|
    puts(x.join(' '))
end
#```