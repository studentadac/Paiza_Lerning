#言語：perl
#問題URL：https://paiza.jp/works/mondai/tree_primer/tree_primer__adjacency_list_input
#コメント： chatgpt
#コード：
#```pl
chomp($N = <>);
@a = ();
for ($i = 1; $i <= $N; $i++) {
    $a[$i] = [];
}

for ($i = 0; $i < $N - 1; $i++) {
    @b = glob<>;
    $a[$b[0]] = [] unless defined $a[$b[0]];
    $a[$b[1]] = [] unless defined $a[$b[1]];
    push(@{$a[$b[0]]}, $b[1]);
    push(@{$a[$b[1]]}, $b[0]);
}

for ($i = 1; $i <= $N; $i++) {
    $a[$i] = [sort {$a <=> $b} @{$a[$i]}];
}

 
 for ($i = 1; $i <= $N; $i++) {
     print "@{$a[$i]}\n";
 }
#```