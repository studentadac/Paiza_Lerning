#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__accompanied_by_stdin_3
#コメント：
#コード：

#```pl
=pod

整数 A, B, C が与えられます。以下のアルゴリズムを実行してください。


変数 N を 0 で初期化する
N に A を足した値を N へ代入する
N に B をかけた値を N へ代入する
N を C で割ったあまりを N へ代入する
N を出力する
=cut
$line=<>;#一行入力を読み込む
#print $line;
($a,$b,$c)=split(/ /, $line);#空白で区切り変数a,b,cにリスト代入
#print $a;
#以下は計算と出力

$n=0;
$n+=$a;
$n*=$b;
$n%=$c;
print $n."\n";

#```