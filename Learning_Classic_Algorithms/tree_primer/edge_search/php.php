<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/tree_primer/tree_primer__edge_search
//コメント：
//コード：
//```php
  $line=trim(fgets(STDIN));
   $array=array_map('intval', (explode(" ",$line)));
   $n=$array[0];
   $k=$array[1];
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
     //     $viited[$a][]=$false;
     //     $viited[$b][]=$false;
        
    }
   // print_r ($g);
    
     for ($i = 1; $i <= $k; $i++) {
        
          $line=trim(fgets(STDIN));
          $array=array_map('intval', (explode(" ",$line)));
     //     print_r($array);
          $qa=$array[0];
          $qb=$array[1];
          

     $exsist=false;
     //直接つながっている辺なので、DFSとか難しいことをしないで該当するgにa,bを結ぶ辺があるかどうかだけを調べる
     foreach ($g[$qa] as $num    )
     {
          if($num===$qb)
          {
              $exsist=true;
              break;
          }
          
            
         
     }
     
     
         
              if($exsist)
              {
                  echo "YES";
              }
              else
              {
                  echo "NO";
              }
              echo "\n";
              
          
          
  
          
        
    }
  //  print_r ($g);
  
    

//```
?>