<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__variable_array_boss
//コメント：二重ループを一重に 参考 https://www.php.net/manual/ja/function.array-slice.php
//コード：
//```php
function convert($input_line)
{
    
    //スペース区切りを配列の境目にする
    $stringarray=explode(" ",$input_line);
    //intに変換
    $a=array_map('intval',$stringarray);
    
    return $a;
}


    $input_line = trim(fgets(STDIN));
    //スペース区切りを配列の境目にする
    $stringarray=explode(" ",$input_line);
    //intに変換
    $a=array_map('intval',$stringarray);
    $n=$a[0];
    $m=$a[1];
    
    $A=explode(" ",trim(fgets(STDIN)));
    $B=convert(trim(fgets(STDIN)));
    
    
    $cnt=0;
    for ($i = 0; $i < $m; $i++) {
      
      $s = array_slice($A, $cnt,$B[$i]);
      
      $output=implode(" ",$s);
      
      
     /*
        for($j=0;$j<$B[$i];$j++)
        {
           echo($A[$j+$cnt]); 
           echo(          )
            
        }
        
    */
    
    
        echo($output."\n");
        $cnt+=$B[$i];
        
        
    }
    
    
    
//```
?>