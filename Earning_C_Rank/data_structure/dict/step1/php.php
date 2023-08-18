<?php

//言語：php
//問題URL: https://paiza.jp/works/mondai/data_structure/data_structure__dict_step1
//コメント：
//コード：
//```php
    // 自分の得意な言語で
    // Let's チャレンジ！！
  //  $input_line = fgets(STDIN);
    $a=array_fill(0, 10, 0);
 //   print_r($a);
    $n= intval(trim(fgets(STDIN)));
    $c= explode(" ",trim(fgets(STDIN)));
    foreach($c as $num)
    {
        $a[$num]++;
    }
    echo implode(' ', $a) . "\n";
//```
?>