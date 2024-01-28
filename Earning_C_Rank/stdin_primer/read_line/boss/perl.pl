#言語：perl
#問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__read_line_boss
#コメント： 
#コード：

#```pl
=pod
s_1, s_2, s_3, ... s_999, s_1000 の 1,000 個の文字列が与えられます。
文字列を与えられた順番通りに出力してください。



=cut
my $n=1000;

for (my $var = 0; $var < $n; $var++) {
    #print単体に改行機能はないが<STDIN>は改行まで読み込んでいるので改行される
    print <STDIN>;
}
#```