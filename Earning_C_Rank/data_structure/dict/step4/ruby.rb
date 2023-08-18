#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_step4
#コメント： 参考 https://docs.ruby-lang.org/ja/latest/method/Hash/s/new.html https://blog.toshimaru.net/ruby-hash-sort/
#```rb

n,m=gets.split().map(&:to_i)
h=Hash.new(-1)

n.times{
    a,b=gets.chomp.split()
    h[a]=b.to_i
}

m.times{
    t=gets.chomp
    puts(h[t])
}
#```