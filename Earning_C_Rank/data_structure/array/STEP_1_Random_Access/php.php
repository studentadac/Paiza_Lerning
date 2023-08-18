<?php

//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__newline_digit_step2
//コメント：
//コード：
//```php

    $s = explode(" ",trim(fgets(STDIN)));
    
    $integers = array_map('intval', $s);
    $m=$s[1]-1;
    //二行目の文字列配列
    $a = explode(" ",trim(fgets(STDIN)));

    echo ($a[$m]);

//```
?>