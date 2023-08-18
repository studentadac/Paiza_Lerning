#言語：ruby
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__accompanied_by_stdin_boss
#コメント：	
#```rb


a,b,c = gets.split(" ").map(&:to_i)
ans=(a-b)+c

printf("%d",ans)
#```