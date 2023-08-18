#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__integer_number_step1
#コメント：
#コード：
#```rb

gets
while line=gets
   line.split(' ').each { |val| puts val.to_i }
end
#```