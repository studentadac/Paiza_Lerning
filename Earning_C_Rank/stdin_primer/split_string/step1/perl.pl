#言語：perl
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__split_string_step2
#コメント： 
#コード：

#```pl
=pod
文字列He likes paizaを、半角スペースで分割して出力してください。
=cut
my $input_line = "He likes paiza";

$input_line =~ s/ /\n/g;
print $input_line."\n";
#```