#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__print_width_step4
#コメント：
#```rb
n,m = gets.split(" ")
while a = gets
printf("%#{m}d\n",a.to_i)
end
#```