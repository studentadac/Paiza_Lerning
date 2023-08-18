<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__string_output_boss
//コメント： 
//コード：javaのString.joinのようにimplodeを使おうとすると末尾に区切り文字列が来るのでechoに"\n"をつけなくていい
//```php
     $A = explode(" ",trim(fgets(STDIN)));
     $ans=implode("\n",$A);
  
   echo($ans);
//```
?>