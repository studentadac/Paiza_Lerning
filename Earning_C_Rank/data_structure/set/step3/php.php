<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/data_structure/data_structure__set_step3
//コメント：参考 https://www.php.net/manual/ja/function.isset.php
//コード：
//```php
   $N=intval(trim(fgets(STDIN)));
 
    //一行分の入力を" "区切りで配列の要素ごとに分割
    $A = explode(" ",trim(fgets(STDIN)));
    
    //空の配列を宣言
    $B=array();
    for ($i = 1; $i < $N; $i++) {
         $B[$A[$i-1]] = true ;
         //存在するかどうか
         echo(isset( $B[$A[$i]]) ?"Yes":"No" );
         echo PHP_EOL;
    }
    //```
?>