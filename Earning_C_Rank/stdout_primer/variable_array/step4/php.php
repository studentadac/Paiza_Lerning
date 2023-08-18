<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step4
//コメント：
//コード：
//```php
 //一行スキップ
fgets(STDIN);
     $input_line = trim(fgets(STDIN));
    //スペース区切りを配列の境目にする
    $stringarray=explode(" ",$input_line);
    //intに変換
    $a=array_map('intval',$stringarray);
    
    
    foreach ( $a as $n  )
    {
    //1から$nまでの連番を  スペース区切りの文字列に変換  
        $s = implode(" ",range(1, $n));
        echo($s."\n");
        
    }
//```
?>