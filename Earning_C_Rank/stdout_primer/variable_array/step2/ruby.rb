#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step２
#コメント：
#```rb

a=gets.split(" ").map(&:to_i)
#p(line)
a.each do |x|
    line = (1..x).to_a
    puts(line.join(' '))
end


```