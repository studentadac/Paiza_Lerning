<?php

//言語：php
//問題URL: https://paiza.jp/works/mondai/d_rank_skillcheck_sample/min_num
//コメント：
//コード：
//```php
$a = array();
$n=5;
for ($i = 0; $i < $n; $i++) {
     $a[]= intval(trim(fgets(STDIN)));
}
 echo min($a);
//```
?>