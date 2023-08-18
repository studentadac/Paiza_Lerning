<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__format_real_number_step3
//コメント: 参考 https://magazine.techacademy.jp/magazine/23019
//コード：
//```php

    $A = explode(" ",trim(fgets(STDIN)));
    $n=floatval($A[0]);
    $m=intval($A[1]);
    
    echo number_format($n, $m)."\n";


//```
?>