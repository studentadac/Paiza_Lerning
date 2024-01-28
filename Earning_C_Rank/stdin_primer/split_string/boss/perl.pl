#言語：perl
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__split_string_boss
#コメント： 
#コード：

#```pl
=pod
文字列one two three four fiveを、半角スペースで分割して出力してください。
=cut
my $input_line = "one two three four five";

$input_line =~ s/ /\n/g;
print $input_line."\n";
#```