
#整数 A = 437,326、 B = 9,085 とします。以下の二つの演算の結果を半角スペース区切りで出力してください。
#1. A を B で割った商
#2. A を B で割った余り
#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__arithmetic_substitution_op_2
#コメント：
#コード：

#```pl
$a=437_326;
$b=9_085;
$div=int($a/$b);
$mod=$a%$b;

print $div." ".$mod."\n";

#```