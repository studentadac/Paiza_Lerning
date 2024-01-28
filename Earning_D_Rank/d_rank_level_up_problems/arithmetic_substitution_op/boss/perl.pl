
#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__arithmetic_substitution_op_boss
#コメント：
#コード：

#```pl
=pod

変数 N を 0 で初期化する
N に 3,286 を足した値を N へ代入する
N に 4,736 をかけた値を N へ代入する
N を 12,312 で割った余りを N へ代入する
N を出力する

=cut

$n=0;
$n+=3_286;
$n*=4_736;
$n%=12_312;

print $n."\n";

#```