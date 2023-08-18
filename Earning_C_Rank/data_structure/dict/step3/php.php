<?php

//言語：php
//問題URL: https://paiza.jp/works/mondai/data_structure/data_structure__dict_step3
//コメント：chatgpt使用
//コード：
//```php
    // 自分の得意な言語で
    // Let's チャレンジ！！
  //  $input_line = fgets(STDIN);
    $a=[];

   // print_r($a);

    $n= intval(trim(fgets(STDIN)));
    $c=[];
    for ($i = 0; $i < $n; $i++) {
       $c[]= trim(fgets(STDIN));
    }
    
    
    
    
    for ($i = 0; $i < $n; $i++) 
    {
        $a[($c[$i])]=0;
    }
    
    
    for ($i = 0; $i < $n; $i++) 
    {
        $a[($c[$i])]++;
    }
   // print_r($a);
    
    ksort($a);
    
   foreach ($a as $string => $count) {
        echo "$string $count\n";
    }

//```

?>