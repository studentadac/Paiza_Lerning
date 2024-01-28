#言語：perl
#問題URL：https://paiza.jp/works/mondai/sequence_search_problems_advanced/sequence_search_problems_advanced__before_after_step2
#コメント： chatgpt
#コード：
#```pl
my($n,$k)=glob<>;
my @a=glob<>;#入力行をスペースで分割
my $max=($k*-100)-1; #下限未満
my $idx_num=$n-1;

my $repeat_time=$k;

for (my $var = 0; $var < ($n- $repeat_time+1 ); $var++) {
   
    $sum=0;
  for (my $j = 0; $j < $repeat_time; $j++)
  {
      $sum+=@a[$var+$j];
  }
  
  if ($sum>$max) {
      
      $idx_num=$var+1;
      $max=$sum;
     
  }
}

print $idx_num;
#```