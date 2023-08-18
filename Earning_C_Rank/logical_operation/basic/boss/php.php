<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_boss
//コメント： 図をそのままコードに
//コード：
//```php
    
     $A = explode(" ",trim(fgets(STDIN)));
    $a=intval($A[0]);
    $b=intval($A[1]);
    $c=intval($A[2]);
    $d=intval($A[3]);
    
    $a=$a^1;
    $b=$b^1;
    $c=$c^1;
    $ans=$a&$b;
    
    $ans= $ans | $c;
    
    $ans=$ans^1;
    
    $ans=$ans^$d;
    
    
    echo($ans."\n");
//```
?>


01  03

1 2





