<?php
//言語：php
//問題URL:https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__loop_boss
//コメント：
//コード：
//```php
$n = intval(100);
for ($i = 1; $i <= $n; $i++) {
 
 if($i%3==0)
 echo("Fizz");
 
 if($i%5==0)
 echo("Buzz");
 
 if($i%3!=0&&$i%5!=0)
 echo($i);
 
 echo("\n");
    // code...
}

//```
?>