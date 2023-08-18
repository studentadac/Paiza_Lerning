<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_step8
//コメント： 同じ入力のテストケースがあります
//コード：
//```php
    
    // 自分の得意な言語で
    // Let's チャレンジ！！
       $A = explode(" ",trim(fgets(STDIN)));
    $a=intval($A[0]);
    $b=intval($A[1]);
    $c=$a & $b;
    $s=($a ^ $b);
    
    echo($c.' '.$s."\n");

//```
?>