<?php

//言語：php
//問題URL: https://paiza.jp/works/mondai/data_structure/data_structure__dict_step2
//コメント：
//コード：
//```php
    // 自分の得意な言語で
    // Let's チャレンジ！！
  //  $input_line = fgets(STDIN);
    $a=[];
    for ($i = ord('a'); $i <= ord('z'); $i++) {
         $a[$i]=0;
    }
   // print_r($a);

    $n= intval(trim(fgets(STDIN)));
    $c= trim(fgets(STDIN));
    
    
    for ($i = 0; $i < $n; $i++) 
    {
        $a[ord($c[$i])]++;
    }
    
    
    echo implode(' ', $a) . "\n";
//```

?>