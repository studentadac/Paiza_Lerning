#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_boss
#コメント: 
#```rb
require 'set'

def trans_set
    
    ar=gets.split().map(&:to_i)
    s=Set.new(ar)
end
    
input_line = gets

a= trans_set
b= trans_set
c=a+b

puts(c.sort.join(' '))

#```