<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_split_boss
//コメント：
//コード：
//```php
   $input_line = trim(fgets(STDIN));
   $rev=strrev($input_line);
    $a=str_split($rev,3);
    
    
    
    $ans=strrev(implode(",",$a));
    echo $ans."\n";
    
    
//```
?>