#言語：ruby
#問題URL：https://paiza.jp/works/mondai/string_primer/basic_step6
#コメント: puts gets.length-1にすると提出前動作確認は通過するのになぜか全部失敗します

#```rb
 
# 自分の得意な言語で
# Let's チャレンジ！！
S = gets.chomp
c = gets.chomp
pattern= /#{c}/
ans= pattern =~ S 

p ans+1
#```