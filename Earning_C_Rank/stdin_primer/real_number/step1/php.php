//言語：php
//問題URL:https://paiza.jp/works/mondai/stdin_primer/stdin_primer__real_number_step1
//コメント：
//コード：
//```php
<?php
   
$n = fgets(STDIN);
trim($n);
 for ($i = 0; $i < $n; $i++) 
{
    echo  fgets(STDIN); //表示
}
?>
//```