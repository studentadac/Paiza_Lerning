#言語：perl
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__read_line_step2
#コメント： 
#コード：

#```pl
=pod
文字列 s と t が 2 行で与えられるので、s と t の 2 行をそのまま出力してください。
=cut
my $n=2;

for (my $var = 0; $var < $n; $var++) {
    
    print <STDIN>;
}
#```