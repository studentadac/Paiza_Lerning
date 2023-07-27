//言語：php
//問題URL:https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__stdin_boss
//コメント：
//コード：
//```php
<?php
$s = trim(fgets(STDIN));
$s = explode(" ", $s);
$n=count($s);
 
for ($i = 0; $i < $n; $i++)
    {
        echo($s[$i]."\n");
    }
?>
//```