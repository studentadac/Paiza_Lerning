#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_step1
#コメント：
#```rb
ar=Array.new(10,0)

n=gets.to_i
a=gets.split().map(&:to_i)

a.each{|num|
    
    ar[num]+=1
}

puts(ar.join(' '))
#```