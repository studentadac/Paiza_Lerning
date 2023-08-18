<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/arithmetic_substitution_op/arithmetic_substitution_op__substitution_step4
//コメント：
//コード：
//```php
        $A = explode(" ",trim(fgets(STDIN)));
    $a=intval($A[0]);
    $b=intval($A[1]);
  $input_line = fgets(STDIN);
    echo ((intdiv(10000,$a)%$b)."\n");
    
 

//```
?>