#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__conditions_branch_boss
#コメント：
#コード：

#```pl
=pod
ある占いでは、箱の中に 1~9 までのいずれかの数字が書かれている玉を取り出し、その玉に書かれている数字から運勢を占います。玉に書かれている数字が 7 の時は大吉となります。占いで取り出した玉に書かれている数字が 1 つ与えられます。大吉かどうかを判定してください。

=cut

#標準入力が7か
print <STDIN>==7?"Yes":"No"."\n";
#```