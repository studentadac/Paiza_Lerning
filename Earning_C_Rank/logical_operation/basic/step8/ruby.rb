#言語：ruby
#問題URL：https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_step8
#コメント: 
#```rb

def half_adder(a,b)
    c=a&b
    s=a^b
    [c,s]
end

a,b=gets.split(" ").map(&:to_i)

c= half_adder(a,b)
puts(c.join(' '))
#```