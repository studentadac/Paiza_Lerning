#言語：perl
#問題URL：https://paiza.jp/works/mondai/stdin/stdin_comma_n
#コメント：
#コード：

#```pl
<STDIN>;#一行目、使わないので入力を捨てる
my $input_line = <>;#二行目以降の全ての入力
$input_line =~ s/,/\n/g;#カンマを改行にすべて置換
print $input_line

#```