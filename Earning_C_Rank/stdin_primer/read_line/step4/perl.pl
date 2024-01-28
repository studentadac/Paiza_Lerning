#言語：perl
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__read_line_step4
#コメント： 
#コード：

#```pl
=pod
s_1, s_2, s_3, ... s_9, s_10 の 10 個の文字列が与えられます。
文字列を与えられた順番通りに出力してください。

=cut
my $n=10;

for (my $var = 0; $var < $n; $var++) {
    #print単体に改行機能はないが<STDIN>は改行まで読み込んでいるので改行される
    print <STDIN>;
}
#```