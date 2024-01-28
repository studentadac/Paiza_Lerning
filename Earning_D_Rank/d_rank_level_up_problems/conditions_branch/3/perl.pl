#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__conditions_branch_3
#コメント：
#コード：

#```pl
=pod

=cut
#整数 A, B, C が与えられます。式 A × B ≦ C が成立している場合はYESを、そうではない場合はNOを出力してください。
($a,$b,$c) = split(/ /, <STDIN>);#標準入力一行目をリスト代入
#print($a." ".$b." ".$c."\n");
print $a*$b<=$c?"YES":"NO"."\n";;
#```