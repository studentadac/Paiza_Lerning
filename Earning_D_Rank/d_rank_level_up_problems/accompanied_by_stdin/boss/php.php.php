<?php
//言語：php
//問題URL:https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__accompanied_by_stdin_boss
//コメント：
//コード：
//```php

$s = trim(fgets(STDIN));
$s = explode(" ", $s);
$integers = array_map('intval', $s);
$a=$integers[0];
$b=$integers[1];
$c=$integers[2];
$n=($a-$b+$c);
echo($n."\n");


//```
?>