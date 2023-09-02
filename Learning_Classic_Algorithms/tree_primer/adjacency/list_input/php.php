<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/tree_primer/tree_primer__adjacency_list_input
//コメント：
//コード：
//```php

    $n=intval(trim(fgets(STDIN)));
    $g=[];
    
    for ($i = 0; $i < $n-1; $i++) {
//整形した文字列を空白区切りの配列にして要素をstringからintに変換
          $line=trim(fgets(STDIN));
          $array=array_map('intval', (explode(" ",$line)));
     //     print_r($array);
        
         
          
          $a=$array[0];
          $b=$array[1];
          
    //      "頂点 i と直接辺で繋がれている頂点"をそれぞれにプッシュ
          $g[$a][]=$b;
          $g[$b][]=$a;
          
        
    }
   // print_r ($g);
    
     for ($i = 1; $i <= $n; $i++) {
        
          
          sort($g[$i]);
          //整列してから空白区切りで結合
          echo implode(" ",$g[$i])."\n";
    
          
          
        
    }
  //  print_r ($g);
  
    

//```
?>