#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_step2
#コメント: Setは順序を保証しない https://teratail.com/questions/c5vzr45pgvz03t
#```rb

gets
a=gets.split().map(&:to_i)



#require 'set'

s=a.uniq
puts(s.join(' '))
#```