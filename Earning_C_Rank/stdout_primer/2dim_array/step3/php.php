<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__2dim_array_step3
//コメント：
//コード：
//```php
   
    $n=9;
    for ($i = 1; $i <= $n; $i++) {
        for($j=1;$j<=$n;$j++)
        {
            echo($i*$j);
            if($j<$n)
            echo(' ');
        }
        echo(PHP_EOL);
        
         // code...
    }
    
    
//```
?>