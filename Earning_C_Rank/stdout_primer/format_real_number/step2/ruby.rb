# 自分の得意な言語で
# Let's チャレンジ！！
#言語：ruby
#問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__format_real_number_step2
#コメント：問題文はよく見たほうが無駄な努力をしなくていい 参考 https://www.javadrive.jp/ruby/regex/index14.html https://www-creators.com/archives/5285#i-2 https://code-bug.net/entry/2019/11/08/131145/
#```rb
s = gets.chomp
kakou=s.gsub(/\.?0+$/, "")
puts(kakou)

#```