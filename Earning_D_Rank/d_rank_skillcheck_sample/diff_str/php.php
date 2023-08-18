<?php

//言語：php
//問題URL: https://paiza.jp/works/mondai/d_rank_skillcheck_sample/diff_str
//コメント：trimが無ければ不正解
//コード：
//```php
  $a = trim(fgets(STDIN));
    $b = trim(fgets(STDIN));
    echo ($a===$b?"OK":"NG");
    echo(PHP_EOL)
//```
?>