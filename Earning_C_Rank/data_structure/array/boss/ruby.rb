#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__array_boss
#コメント：
#```rb


def prints(a)
    puts(a.join(' '))
    
end

def push_back(a,b)
    a.push(b)
end


def pop_back(a)
    a.pop
end

n,Q=gets.chomp.split().map(&:to_i)
a=gets.chomp.split().map(&:to_i)

while line =gets
    q=line.chomp.split().map(&:to_i)
    
    case q[0]
    when 0 then push_back(a,q[1])
    when 1 then pop_back(a)
    when 2 then prints(a)
end
end
    

#```