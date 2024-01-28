<?php
//言語：php
//問題URL:
//コメント：参考 https://qiita.com/takelushi/items/283d2ef295f4ccaeca57
//コード：https://paiza.jp/works/mondai/string_primer/normal_step2
//```php

    // 自分の得意な言語で
    // Let's チャレンジ！！
    $s = trim(fgets(STDIN));
    $t = trim(fgets(STDIN));
    $n = (int)trim(fgets(STDIN));
    function insertStr2($text, $insert, $num){
    return preg_replace("/^.{0,$num}+\K/us", $insert, $text);
}
echo insertStr2($s, $t, $n);

    

//```
?>