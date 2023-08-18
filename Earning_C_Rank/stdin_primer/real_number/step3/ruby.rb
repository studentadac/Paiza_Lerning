#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__real_number_step3
#コメント：
#コード：
#```rb
line=gets
 
line= line.split(' ')
line.shift(1)
line.each { |val| puts val.to_f }


#```