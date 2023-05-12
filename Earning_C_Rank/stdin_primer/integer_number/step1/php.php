//言語：php
//問題URL:https://paiza.jp/works/mondai/stdin_primer/stdin_primer__integer_number_step1
//コメント：参考:https://trios.pro/php-feof/
//コード：
//```php
<?php
  
  
 $Hello=fgets(STDIN);

while (($buffer = fgets($fp_r)) != false) {

	echo $buffer; //表示
}

?>
//```