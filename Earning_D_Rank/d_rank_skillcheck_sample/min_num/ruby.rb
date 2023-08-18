#言語：ruby
#問題URL：https://paiza.jp/works/mondai/d_rank_skillcheck_sample/min_num
#コメント：
#コード：
#```rb
ans=100
for i in  1..5
    a = gets.to_i
    ans=[a,ans].min
   # puts ans
end

puts ans
#```