<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_split_step6
//コメント：
//コード：
//```php
   $input_line = trim(fgets(STDIN));
    $a=str_split($input_line,3);
    
    $ans=implode(",",$a);
    echo $ans."\n";
    
    
//```
?>