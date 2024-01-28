#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__conditions_branch_2
#コメント：
#コード：

#```pl
=pod
整数Nが与えられます。Nが 100 以下の場合はYESを、そうではない場合はNOを出力してください。
=cut
my $n =(<STDIN>);
chomp($input_line);
print (($n<=100)?"YES":"NO");
#```