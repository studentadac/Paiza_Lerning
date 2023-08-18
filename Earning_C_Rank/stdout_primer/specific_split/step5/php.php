<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_split_step5
//コメント：
//コード：
//```php
    $a = array();
    $n=10;
    
    for ($i = 0; $i < $n; $i++) {
         $a[]=trim(fgets(STDIN));
         // code...
    }
    $ans=implode(" | ",$a);
  //  $ans=substr($ans, 0, -1);
    echo $ans."\n";
    
    
//```
?>