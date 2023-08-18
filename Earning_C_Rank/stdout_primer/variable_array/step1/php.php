<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_step1
//コメント：
//コード：
//```php
   
   $N = intval(trim(fgets(STDIN)));
 
    for ($i = 1; $i <= $N; $i++) {
        echo($i);
        if($i%($N/2)==0)
        echo(PHP_EOL);
        else
        echo(' ');
        
        
    }
//```
?>