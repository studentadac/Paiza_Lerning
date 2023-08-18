#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__2dim_array_step2
#コメント：参考 https://qiita.com/shiori771/items/13ab5d1895c7b90aefa1
#```rb
line = gets.chomp.split
#p(line)
ans=line.each_slice(3).to_a
#p(ans)
ans.each do |x|
    puts(x.join(' '))
end
#```