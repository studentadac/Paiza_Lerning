#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_boss
#コメント： 
#```rb

n,m=gets.split().map(&:to_i)
h={}
1.upto(n){|i|
    a=gets.chomp
    if(!h[a])
        h[a]=i
    end
    
}

m.times{|x|
    t=gets.chomp
    if (h[t])
    puts(h[t])
    else
        puts(-1)
    end
}
#```