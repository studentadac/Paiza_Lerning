#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_skillcheck_sample/min_num
#コメント： 参考 https://mas3lab.net/perl/waza/min.html
#コード：

#```pl
=pod
5 つの正の整数が入力されるので、最も小さい数字を出力して下さい。
=cut
my @array=();

for (my $var = 0; $var < 5; $var++) {
    push(@array,<STDIN>);
    # body...
}
use strict;
use warnings;
use List::Util qw(min);

my $min = min @array;
print $min, "\n";


#```