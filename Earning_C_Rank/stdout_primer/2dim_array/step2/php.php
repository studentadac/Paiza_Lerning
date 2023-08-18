<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__2dim_array_step2
//コメント：
//コード：
//```php
      $input_line = trim(fgets(STDIN));
    $a=explode(" ",$input_line);
    $n=3;
    for ($i = 0; $i < $n; $i++) {
        for($j=0;$j<$n;$j++)
        {
            echo($a[$i*3+$j]);
            if($j<$n-1)
            echo(' ');
        }
        echo(PHP_EOL);
        
         // code...
    }
    
    
//```
?>