<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/string_primer/basic_step6
//コメント： 
//コード：
//```php
     // Let's チャレンジ！！
    $input_line = trim(fgets(STDIN));
    $p = trim(fgets(STDIN));
    $ans=mb_strpos($input_line,$p);
   // echo($ans);
    echo( $ans>=0?$ans+1:"!"  );
    echo("\n");

    
//```
?>

