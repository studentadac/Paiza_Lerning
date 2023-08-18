<?php

//言語：php
//問題URL: https://paiza.jp/works/mondai/d_rank_skillcheck_sample/addition
//コメント：
//コード：
//```php



    $s = trim(fgets(STDIN));
$s = explode(" ", $s);
$integers = array_map('intval', $s);
$a=$integers[0];
$b=$integers[1];
    echo $a+$b;

//```
?>