#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__accompanied_by_stdin_2
#コメント：
#コード：

#```pl
=pod

整数 A, B が与えられます。A と B の差 D と積 P を半角スペース区切りで出力してください。

=cut
$line=<>;#一行入力を読み込む
#print $line;
($a,$b)=split(/ /, $line);#空白で区切り変数a,bにリスト代入
#print $a;
#以下は計算と出力
$d=$a-$b;
$p=$a*$b;
print $d." ".$p."\n";

#```