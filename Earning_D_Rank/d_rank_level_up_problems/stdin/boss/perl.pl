
#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__stdin_boss
#コメント：
#コード：

#```pl
=pod
文字列 s_1, s_2 が半角スペースで区切られて 1 行で与えられます。
各文字列を出力するごとに改行し 2 行で出力してください。
=cut
my $input_line = <>;
$input_line =~ s/ /\n/g;#空白を改行に置換
print $input_line."\n"

#```