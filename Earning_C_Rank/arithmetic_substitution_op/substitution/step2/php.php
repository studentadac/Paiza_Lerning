<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/arithmetic_substitution_op/arithmetic_substitution_op__substitution_step2
//コメント：
//コード：
//```php
      $A = explode(" ",trim(fgets(STDIN)));
    $a=intval($A[0]);
    $b=intval($A[1]);
    $c=strval($A[2]);
    
       $n=$a;
    
    $n*=$b;
    $n%=$c;
    echo $n;
    

//```
?>