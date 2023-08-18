<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/string_primer/basic_step7
//コメント： 
//コード：
//```php
     // 自分の得意な言語で
    // Let's チャレンジ！！
    $n = intval(trim(fgets(STDIN)));
    
    $ans="";
    for ($i = 0; $i < $n; $i++) {
         $ans.=strval(trim(fgets(STDIN)));
    }
    echo($ans);
    
//```
?>

