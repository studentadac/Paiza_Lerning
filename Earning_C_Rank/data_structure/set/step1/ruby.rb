#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__set_step1
#コメント： 公式リファレンスyや https://www.sejuku.net/blog/41681 を読むとsplitは最後の改行文字\nが空白文字として扱われて削除されるのでchompかstripで加工する必要がないみたいですね
#```rb

n,b=gets.split()

a=gets.split()

require 'set'

s=Set.new(a)

puts(s.include?(b)?"Yes":"No")
#```