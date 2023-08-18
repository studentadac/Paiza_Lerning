<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_split_step2
//コメント：implodeの区切り文字の末尾の扱いがよくわからない 
//コード：
//```php
    // Let's チャレンジ！！
    $a = array();
    $n=3;
    
    for ($i = 0; $i < $n; $i++) {
         $a[]=trim(fgets(STDIN));
         // code...
    }
    $ans=implode("|",$a);
  //  $ans=substr($ans, 0, -1);
    echo $ans."\n";
    
    
//```
?>