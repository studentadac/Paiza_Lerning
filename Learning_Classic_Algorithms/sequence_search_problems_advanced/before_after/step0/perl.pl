#言語：perl
#問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__before_after_step0
#コメント： chatgpt
#コード：
#```pl
my $n = <STDIN>;
my @a=glob<>;
my $cnt=0;

for (my $var = 0; $var < ($n-1); $var++) {
    if (@a[$var]==@a[$var+1]) {
        $cnt+=1;
    }
  
}

print $cnt
#```