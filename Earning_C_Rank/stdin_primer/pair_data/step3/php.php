//言語：php
//問題URL:
https://paiza.jp/works/mondai/stdin_primer/stdin_primer__pair_data_step3
https://paiza.jp/works/mondai/stdin_primer/stdin_primer__pair_data_boss
//コメント：
//コード：
//```php
<?php
   
$n = fgets(STDIN);
trim($n);
$x;
 for ($i = 0; $i < 8; $i++) 
{
    $x[]=  fgets(STDIN); //表示
}
echo($x[7]);
?>
//```