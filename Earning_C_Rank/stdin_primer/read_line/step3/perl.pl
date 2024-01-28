#言語：perl
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__read_line_step3
#コメント： 
#コード：

#```pl
=pod
文字列 s, t, u が 3 行で与えられるので、s, t, u の 3 行をそのまま出力してください。
=cut
my $n=3;

for (my $var = 0; $var < $n; $var++) {
    
    print <STDIN>;
}
#```