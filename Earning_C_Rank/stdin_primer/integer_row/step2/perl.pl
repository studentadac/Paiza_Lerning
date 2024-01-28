#言語：perl
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__integer_row_step2
#コメント： 
#コード：

#```pl
=pod
整数 a, b が 2 行で与えられるので a, b を 2 行で出力してください。


=cut
$n=2;
for (my $var = 0; $var < $n; $var++) {
    # body...

my $input_line = <>;

#$input_line =~ s/ /\n/g;
print $input_line;
}
#```