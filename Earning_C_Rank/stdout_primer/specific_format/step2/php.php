<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step2
//コメント: 
//コード：
//```php

    $A = explode(" ",trim(fgets(STDIN)));
    $n=intval($A[0]);
    $a=strval($A[1]);
    $b=strval($A[2]);
    
    //出力がpythonのタプルっぽいので
    $tuple="("."$a, $b".")";
    //echo($tuple)
    
    for ($i = 0; $i < $n; $i++) {
        echo($tuple);
        echo($i<$n-1?", ":"\n"   );
       
    }
    



//```
?>