#言語：perl
#問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__before_after_step4
#コメント： chatgpt
#コード：
#```pl
my($n,$m)=glob<>;
my @a=glob<>;#入力行をスペースで分割
my @b=glob<>;#入力行をスペースで分割
my $idx_num=$n-1;
use List::Util qw(sum);

my $b_sum=List::Util::sum(@b);

my $repeat_time=$m;

for (my $var = 0; $var < ($n- $repeat_time+1 ); $var++) {
   
    $sum=0;
  for (my $j = 0; $j < $repeat_time; $j++)
  {
      $sum+=@a[$var+$j];
  }
  
  if ($sum==$b_sum) {#見つけたら処理を終了
     $idx_num=$var+1 ;
     print $idx_num;
     exit(0);
     
     
  }
}
#見つからなかったら-1を出力
print -1;

#```