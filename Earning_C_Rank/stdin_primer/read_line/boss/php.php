//言語：php
//問題URL:https://paiza.jp/works/mondai/stdin_primer/stdin_primer__read_line_boss
//コメント：
//コード：
//```php
<?php
   
 const n=1000;//変更しないので定数化
   for ($i = 0; $i < n; $i++)//n回繰り返す
   {
         echo(fgets(STDIN));//入力をそのまま出力 
   }
  
?>
//```