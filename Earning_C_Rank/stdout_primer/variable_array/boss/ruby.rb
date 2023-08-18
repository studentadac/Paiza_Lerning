#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_boss
#コメント：
#```rb
n,m=gets.split(" ").map(&:to_i)

a=gets.split(" ").map(&:to_i)
b=gets.split(" ").map(&:to_i)
cnt=0
b.each do |x|
    ans=[]
  x.times do
    ans.push(a[cnt])
    cnt += 1
  end
  puts(ans.join(' '))
end
```