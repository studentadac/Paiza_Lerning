#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_split_boss
#コメント：	
#```rb
line = gets.chomp.reverse

ans=line.scan(/.{1,#{3}}/).join(',').reverse
puts(ans)
#```