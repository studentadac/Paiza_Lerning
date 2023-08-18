<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__print_width_step1
//コメント: gpt使用
//コード：
//```php

// 標準入力からNを取得
$N = trim(fgets(STDIN));

// 数値を3桁になるように前に半角スペースを埋めて出力
echo sprintf("%3d", $N) . "\n";
//```
?>