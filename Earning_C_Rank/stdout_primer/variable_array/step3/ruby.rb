#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step3
#コメント：
#```rb
n = gets.to_i
ans=[]
1.upto(n) do |x|
    ans.push(x)
    puts(ans.join(' '))
end
```