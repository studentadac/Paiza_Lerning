#言語：perl
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__split_input_step1
#コメント： 
#コード：

#```pl
=pod
半角スペースを含まない文字列 s が 1 行で与えられるので、そのまま出力してください。
=cut
my $input_line = <>;

#$input_line =~ s/ /\n/g;
print $input_line."\n";
#```