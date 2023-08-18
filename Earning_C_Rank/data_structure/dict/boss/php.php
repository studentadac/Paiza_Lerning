<?php

//言語：php
//問題URL: https://paiza.jp/works/mondai/data_structure/data_structure__dict_boss
//コメント：
//コード：
//
   $a = explode(" ",trim(fgets(STDIN)));
   $n =$a[0];
   $m= $a[1];
   $b=[];
   
    
    for ($i = 0; $i < $n; $i++) {
       $c= explode(" ",trim(fgets(STDIN)));
       $s=$c[0];
       
       if(!isset($b[$s]))
        {
            $b[$s]=$i+1;
        }
        
       
       
    }
    
    
    
    
    for ($i = 0; $i < $m; $i++) 
    {
        $s=trim(fgets(STDIN));
        if(isset($b[$s]))
        {
            echo($b[$s] . "\n");
        }
        else
        {
            echo(-1 . "\n");
        }
        
    }
    
    
    
//


?>