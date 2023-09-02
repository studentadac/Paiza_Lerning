#言語：ruby
#問題URL：https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_boss
#コメント: phpの流用
#```rb
 
$a,$b,$c,$d=gets.split(" ").map(&:to_i)
    
    $a=$a^1;
    $b=$b^1;
    $c=$c^1;
    $ans=$a&$b;
    
    $ans= $ans | $c;
    
    $ans=$ans^1;
    
    $ans=$ans^$d;
    
    p $ans
#```