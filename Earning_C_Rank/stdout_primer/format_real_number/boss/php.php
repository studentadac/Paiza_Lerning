<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__format_real_number_boss
//コメント: 
//コード：
//```php

    $N = intval(trim(fgets(STDIN)));
    for ($i = 0; $i < $N; $i++) {
    $A = explode(" ",trim(fgets(STDIN)));
    $n=floatval($A[0]);
    $m=intval($A[1]);
    
    echo number_format($n, $m)."\n"; // code...
    }

//```
?>