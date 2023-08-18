#言語：ruby
#問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_step3
#コメント： 参考 https://docs.ruby-lang.org/ja/latest/method/Hash/s/new.html https://blog.toshimaru.net/ruby-hash-sort/
#```rb

input_line = gets
h=Hash.new(0)

while line=gets
        h[line.chomp]+=1
end
ans=h.sort
#print ans
ans.each{|pair|
    
  puts pair.join(' ')  
}
#```