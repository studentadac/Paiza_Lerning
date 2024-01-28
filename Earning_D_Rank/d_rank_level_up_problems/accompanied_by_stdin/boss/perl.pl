#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__accompanied_by_stdin_boss
#コメント：
#コード：

#```pl
=pod
ある電車に a 人が乗っています。駅に到着した時に b 人が降りて新たに c 人が乗車する時、電車に乗っている乗客人数を求めてください。
=cut
$line=<>;#一行入力を読み込む
#print $line;
($a,$b,$c)=split(/ /, $line);#空白で区切り変数a,b,cにリスト代入
#print $a;
#以下は計算と出力

$n=0;
$n+=$a;
$n-=$b;
$n+=$c;
print $n."\n";

#```