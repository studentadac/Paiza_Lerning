#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step3
#コメント：
#```rb
n=9
a=(1..n).to_a
a.each do |x|
    c=a.map{ |element| element * x }
    d=c.map{ |element| format("%2d", element) }
    line=d.join(' | ')
    puts(line)
    if (c[0]!=9)
        puts('='*line.length)
    end
end
#```