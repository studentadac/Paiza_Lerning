//言語：php
//問題URL:
https://paiza.jp/works/mondai/stdin_primer/stdin_primer__matrix_data_boss
//コメント：
//コード：
//```php
<?php
$n = fgets(STDIN);

 while (($buffer = fgets(STDIN)) != false) //入力が取得できなくなるまで入力を繰り返す
{
    $sentence =explode(" ", $buffer);
     $n=$sentence[0];
unset($sentence[0]);//nを削除
$ans="";
    for ($i = 0; $i < $n; $i++) {
$ans .= $sentence[$i+1]." ";


        
    }
$ans = substr($ans, 0, -1);

    
    echo($ans);
}

?>
//```