<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step2
//コメント：参考 https://marycore.jp/prog/php/range-sequence/
//コード：
//```php
   
     $input_line = trim(fgets(STDIN));
    //スペース区切りを配列の境目にする
    $stringarray=explode(" ",$input_line);
    //intに変換
    $a=array_map('intval',$stringarray);
    
    foreach ( $a as $n  )
    {
        $s = implode(" ",range(1, $n));
        echo($s."\n");
        
    }
//```
?>