<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/string_primer/normal_step1
//コメント： 
//コード：
//```php
    // 自分の得意な言語で
    // Let's チャレンジ！！
    $input_line = trim(fgets(STDIN));
    
     $A = explode(" ",trim(fgets(STDIN)));
     $i=intval($A[0])-1;
     $j=intval($A[1])-$i;
     echo(  substr( $input_line,$i,$j     ) );
    
//```
?>

