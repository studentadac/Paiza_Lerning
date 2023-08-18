#言語：ruby
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__accompanied_by_stdin_2
#コメント：	
#```rb
a,b = gets.split(" ").map(&:to_i)
d=a-b
P=a*b

printf("%d %d",d,P)
#```