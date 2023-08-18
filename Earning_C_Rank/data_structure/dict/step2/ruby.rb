#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_step2
#コメント：
#```rb

gets
b=gets.chomp.chars



ar=Array.new(26,0)

b.each{ |chr|
    ar[chr.ord-"a".ord]+=1
    
}

puts(ar.join(' '))
#```