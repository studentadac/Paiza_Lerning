<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step3
//コメント：参考 https://marycore.jp/prog/php/range-sequence/
//コード：
//```php
   
    $n = intval(trim(fgets(STDIN)));
   
   for ($i = 1; $i <= $n; $i++) {

        $s = implode(" ",range(1, $i));
        echo($s."\n");
        
    }
//```
?>