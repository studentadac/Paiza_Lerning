#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_step2
#コメント:
#```rb

gets
a=gets.split().map(&:to_i)



require 'set'

s=SortedSet.new(a)
puts(s.join(' '))
#```