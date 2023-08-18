#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__string_output_step4
#コメント：	
#```rb
a=[]
while line=gets
   a.push(line.strip)
end
puts a.join(' ')
#```