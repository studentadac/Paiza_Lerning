<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/data_structure/data_structure__set_step1
//コメント：参考 https://qiita.com/ritukiii/items/3a6add378ae089ab5d70
//コード：
//```php
    // 自分の得意な言語で
    // Let's チャレンジ！！
    $input_line = trim(fgets(STDIN));
    $line=explode(" ",$input_line);
    $N=$line[0];
    $B=$line[1];
    
    $A = explode(" ",trim(fgets(STDIN)));
  //  $ASET=array_unique($A,SORT_NUMERIC);
    $ASET=array_unique($A);//一回だけ数字を探索したいならソートしないほうが早い
    
 //   if(in_array($B, $ASET, true))
    echo (in_array($B, $ASET, true) ?"Yes":"No")."\n";
  //  else
  //  echo "No"
   
//```
?>