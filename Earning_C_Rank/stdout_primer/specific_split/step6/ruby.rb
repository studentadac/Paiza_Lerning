#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_split_step6
#コメント：	
#```rb
line = gets
ans=line.scan(/.{1,#{3}}/)
puts(ans.join(','))
#```