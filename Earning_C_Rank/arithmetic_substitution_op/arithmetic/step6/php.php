<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/arithmetic_substitution_op/arithmetic_substitution_op__arithmetic_step6
//コメント：
//コード：
//```php
   $A = explode(" ",trim(fgets(STDIN)));
    $a=intval($A[0]);
    $b=intval($A[1]);
    $c=strval($A[2]);
    $d=strval($A[3]);
    
    //A = 202、B = 134、C = 107 
    echo(pow((($a+$b)*$c),2)%$d."\n");
//```
?>