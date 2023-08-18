#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__array_step2
#コメント：
#```rb
 n = gets
 a=gets.chomp.split()
 q=gets
 b=gets.chomp.split().map(&:to_i)
 
 b.each do |x|
    puts(a[x-1])
 end

#```