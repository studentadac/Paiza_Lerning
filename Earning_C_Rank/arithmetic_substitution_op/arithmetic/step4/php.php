<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/arithmetic_substitution_op/arithmetic_substitution_op__arithmetic_step3
//コメント：
//コード：
//```php
   $A = explode(" ",trim(fgets(STDIN)));
    $a=intval($A[0]);
    $b=intval($A[1]);
    $c=strval($A[2]);
    
    echo($a*$a.' '.$b*$b+$c*$c);
//```
?>