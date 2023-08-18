<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_boss
//コメント: 
//コード：
//```php
  
   $A = explode(" ",trim(fgets(STDIN)));
    $h=intval($A[0]);
    $w=intval($A[1]);
    $a=strval($A[2]);
    $b=strval($A[3]);
    
    //出力がpythonのタプルっぽい
    $tuple="(".str_pad($a, 9, ' ', STR_PAD_LEFT).", ". str_pad($b, 9, ' ', STR_PAD_LEFT).")";
    //echo($tuple)
     for ($i = 0; $i <$h; $i++) 
     {
         $s="";
    for ($j = 0; $j < $w; $j++) {
        $s.=$tuple;

        $s.=($j<$w-1?" | ":"\n"   );
       
    }
      
         echo($s);
         if($i<$h-1)
         {
             //-1は\nの一文字
             $line=str_repeat("=",(mb_strlen($s)-1 ))."\n";
             echo($line);
             
         }
         
     }
    


//```
?>