<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/data_structure/data_structure__set_step2
//コメント：参考 https://satoru103.hatenablog.com/entry/2021/01/16/140544
//コード：
//```php
  
    $N=trim(fgets(STDIN));
 
    //一行分の入力を" "区切りで配列の要素ごとに分割
    $A = explode(" ",trim(fgets(STDIN)));
    
    //数値順にソートしながら集合に変換
    $ASET=array_unique($A,SORT_NUMERIC);
    
    //配列を" "で結合 
    $ans=implode(" ",$ASET);
    
    echo($ans."\n");
   

?>