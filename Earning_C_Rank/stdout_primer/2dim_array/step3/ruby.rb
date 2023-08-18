#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__2dim_array_step3
#コメント：参考 gpt
#```rb
a=(1..9).to_a
#b=(1..9).to_a

a.each do |x|
    c=a.map{ |element| element * x }
    puts(c.join(' '))
end
#```