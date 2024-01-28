#言語：perl
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__split_input_step2 https://paiza.jp/works/mondai/stdin_primer/stdin_primer__split_input_step3
#コメント： 
#コード：

#```pl
=pod
文字列 s_1, s_2 が半角スペースで区切られて 1 行で与えられます。
各文字列を出力するごとに改行し 2 行で出力してください。


=cut
my $input_line = <>;

$input_line =~ s/ /\n/g;
print $input_line."\n";
#```