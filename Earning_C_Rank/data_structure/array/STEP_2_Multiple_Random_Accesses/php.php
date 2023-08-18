<?php

//言語：php
//問題URL: https://paiza.jp/works/mondai/data_structure/data_structure__array_step2
//コメント：
//コード：
//```php

    fgets(STDIN);
    
    
   
    $a = explode(" ",trim(fgets(STDIN)));
    
    
    
    $n=intval(trim(fgets(STDIN)));
    
    $s = explode(" ",trim(fgets(STDIN)));
    $integers = array_map('intval', $s);
    
    foreach ($integers as $num  )
    {
        echo("{$a[$num-1]}\n");
        
        
    }
    



//```
?>