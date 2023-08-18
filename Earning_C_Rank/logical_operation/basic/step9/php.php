<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/logical_operation/logical_operation__basic_step9
//コメント： 
//コード：
//```php
    
    // 自分の得意な言語で
    // Let's チャレンジ！！
       $A = explode(" ",trim(fgets(STDIN)));
    $a=intval($A[0]);
    $b=intval($A[1]);
    $c1=intval($A[2]);
    $cx=$a & $b;
    $sy=($a ^ $b);
    
    $cy=$sy&$c1;
    
    $c=$cx|$cy;
    
    $s=$c1^$sy;
    
    
    echo($c.' '.$s."\n");

//```
?>