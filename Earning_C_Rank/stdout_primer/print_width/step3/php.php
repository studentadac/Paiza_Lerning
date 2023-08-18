<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__print_width_step3
//コメント: gpt使用
//コード：
//```php


    // 自分の得意な言語で
    // Let's チャレンジ！！
   $n = intval(trim(fgets(STDIN)));
    for ($i = 0; $i < $n; $i++) {
         // code...
         $m = trim(fgets(STDIN));

// 数値を3桁になるように前に半角スペースを埋めて出力
echo str_pad($m, 3, ' ', STR_PAD_LEFT) . "\n";
    }

//```
?>