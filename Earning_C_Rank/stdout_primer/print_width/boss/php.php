<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__print_width_boss
//コメント: gpt使用
//コード：
//```php

    $A = explode(" ",trim(fgets(STDIN)));
    $n=floatval($A[0]);
    $m=intval($A[1]);
    
for ($i = 0; $i < $n; $i++) {
 // 数値を3桁になるように前に半角スペースを埋めて出力
echo str_pad(trim(fgets(STDIN)), $m, ' ', STR_PAD_LEFT) . "\n";    // code...
}




//```
?>