#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_skillcheck_sample/diff_str
#コメント： 
#コード：

#```pl
=pod


=cut
my $a = <STDIN>;
chomp($a);
my $b = <STDIN>;
chomp($b);
print (($a eq $b?"OK":"NG")."\n");
#```