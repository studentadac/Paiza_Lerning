<?php

//言語：php
//問題URL: https://paiza.jp/works/mondai/data_structure/data_structure__array_boss
//コメント：型を意識しない書き方
//コード：
//```php
 
   
    $a = explode(" ",trim(fgets(STDIN)));
    $q=$a[1];
    $s = explode(" ",trim(fgets(STDIN)));
    for ($i = 0; $i < $q; $i++) {
        
        $query = explode(" ",trim(fgets(STDIN)));
        
switch ($query[0]) {
    case 0:
        $s[]=$query[1];
        break;
    case 1:
        array_pop($s);
        break;
    case 2:
        echo implode(' ', $s) . "\n";
        break;
  
    default:
        echo "miss";
        break;
}
        
        // code...
    }
   
    
//```
?>