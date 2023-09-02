#言語：ruby
#問題URL：https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_step9
#コメント: 
#```rb

def half_adder(a,b)
    c=a&b
    s=a^b
    [c,s]
end

def all_adder(a,b,c)
    cx,sy=half_adder(a,b) 
    cy,s=half_adder(sy,c)
    c2=cx^cy
    [c2,s]
end


a,b,c=gets.split(" ").map(&:to_i)

c= all_adder(a,b,c)
puts(c.join(' '))
#```