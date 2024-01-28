#言語：perl
#問題URL：https://paiza.jp/works/mondai/stdin/stdin_comma_3
#コメント：
#コード：

#```pl
#<STDIN>;
my $input_line = <>;
$input_line =~ s/,/\n/g;
print $input_line

#```