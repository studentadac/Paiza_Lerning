<?php

//言語：php
//問題URL: https://paiza.jp/works/mondai/data_structure/data_structure__string_boss
//コメント：
//コード：
//```php

$a = explode(" ",trim(fgets(STDIN)));
$n=$a[2];//rまで探せばいい



$b=array();
for ($i = 0; $i < $n; $i++) {
    $c=trim(fgets(STDIN));
  //  print_r($c);
    $b[]=$c;
    
}

$r=intval($a[2]-1);
$c =intval($a[3]-1);
$ans= $b[$r][$c]==="#";


echo $ans?"Yes":"No";

//```
?>