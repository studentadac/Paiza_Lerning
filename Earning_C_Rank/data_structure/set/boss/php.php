<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/data_structure/data_structure__set_boss
//コメント： chatGPT使用
//コード：
//```php
   $N=intval(trim(fgets(STDIN)));
 
    //一行分の入力を" "区切りで配列の要素ごとに分割
    $A = explode(" ",trim(fgets(STDIN)));
    $B = explode(" ",trim(fgets(STDIN)));
$C = array_unique(array_merge($A, $B));

// 数列を昇順にソート
sort($C, SORT_NUMERIC);

// 答えとなる数列 C を半角スペース区切りで1行に出力
$ans = implode(" ", $C);
echo $ans . "\n";


    
    //```
?>