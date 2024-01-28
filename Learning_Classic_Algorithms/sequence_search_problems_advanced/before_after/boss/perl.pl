#言語：perl
#問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__before_after_boss
#コード：
#```pl
my($n,$m)=glob<>;
my @a=glob<>;#入力行をスペースで分割
my @b=glob<>;#入力行をスペースで分割

$b_num=0;

for (my $var = 0; $var < $n; $var++) {
   if(@a[$var]==@b[$b_num])
   {
       $b_num++;
       if($b_num==$m)
   {
       break;
   }
   }
   
   
   
}

print (($b_num==$m)?"Yes":"No");
#```