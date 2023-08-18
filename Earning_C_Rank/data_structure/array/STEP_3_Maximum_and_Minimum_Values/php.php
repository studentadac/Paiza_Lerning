<?php

//言語：php
//問題URL: https://paiza.jp/works/mondai/data_structure/data_structure__array_step3
//コメント：
//コード：
//```php
 
    $s = explode(" ",trim(fgets(STDIN)));
    $integers = array_map('intval', $s);
    $a=max($integers);
    $b=min($integers);
    $ans=$a-$b;
    echo("$ans\n");

//```
?>