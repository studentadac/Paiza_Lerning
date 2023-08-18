<?php
//言語：php
//問題URL:
//コメント：
//コード：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__space_oneline_boss
//```php
$ans="";
for ($i = 1; $i <= 1000; $i++) {
     $ans.=strval($i).' ';
     // code...
}
    
    echo(substr($ans,0,-1));

//```
?>