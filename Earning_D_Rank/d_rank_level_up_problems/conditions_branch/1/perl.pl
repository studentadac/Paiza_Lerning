#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__conditions_branch_1
#コメント：
#コード：

#```pl
=pod
文字列Sが与えられます。Sがpaizaと一致する場合はYESを、一致しない場合はNOを出力してください。
=cut
my $input_line =(<STDIN>);
chomp($input_line);
print (($input_line eq "paiza")?"YES":"NO");
#```