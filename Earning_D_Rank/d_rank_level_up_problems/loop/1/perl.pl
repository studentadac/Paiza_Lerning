#言語：perl
#問題URL：https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__loop_boss
#コメント：
#コード：

#```pl
=pod
1 ~ 100 の整数に対して、3 と 5 の両方で割り切れるなら FizzBuzz を、 3 でのみ割り切れるなら Fizz 、5 でのみ割り切れるなら Buzz を改行区切りで出力してください。また、どちらでも割り切れない場合は、その数字を改行区切りで出力してください。

=cut
$N=100;
for (my $var = 1; $var <=$N; $var++) {
    
    
    #FizzとBuzzは繋げたらFizzBuzzになるのでFizzBuzzの場合の条件分岐を省略
    if ($var%3==0) {
        print "Fizz";
        # body...
    }
    if ($var%5==0) {
        print "Buzz";
        # body...
    }
    
    if($var%5!=0 && $var%3!=0){
        print $var;
        
    }
    
    print "\n";
}

#```