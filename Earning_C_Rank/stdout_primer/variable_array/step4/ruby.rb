#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step4
#コメント：
#```rb
n= gets.to_i

a=gets.split(" ").map(&:to_i)

a.each do |x|
    b=(1..x).to_a
    c=b.join(' ')
    puts(c)
    
end
```