#言語：ruby
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__loop_boss
#コメント：	
#```rb

n = 100

1.upto(n) do |x| 
  case
  when x % 3 == 0 && x % 5 == 0
    puts("FizzBuzz")
  when x % 3 == 0
    puts("Fizz")
  when x % 5 == 0
    puts("Buzz")
  else
    puts(x)
  end
end

#```