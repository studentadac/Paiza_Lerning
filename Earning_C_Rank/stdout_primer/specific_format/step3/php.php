<?php
//言語：php
//問題URL: https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step3
//コメント: 
//コード：
//```php
    for ($i = 1; $i <=9; $i++) {
         
         $s="";
         for ($j = 1; $j <=9; $j++) {
             
             $m=strval($i*$j);
             $s.=str_pad($m, 2, ' ', STR_PAD_LEFT);
             $s.=($j<9?" | ":"\n");
             
             
         }
         
         
         
         echo($s);
         if($i<9)
         {
             //-1は\nの一文字
             $line=str_repeat("=",(mb_strlen($s)-1 ))."\n";
             echo($line);
             
         }
    }
    
    

//```
?>