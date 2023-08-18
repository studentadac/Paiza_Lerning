<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__string_output_step4
//コメント： 
//コード：javaのString.joinのようにimplodeを使おうとすると末尾に区切り文字列が来てしまうので、区切り文字列のサイズ分行末を削除する
//```php
     $A = explode(" ",trim(fgets(STDIN)));
     $ans=implode("\n",$A);
  
   echo($ans);
//```
?>