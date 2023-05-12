//言語：php
//問題URL:https://paiza.jp/works/mondai/stdin_primer/stdin_primer__real_number_step4
//コメント：
//コード：
//```php
<?php
$n = fgets(STDIN);
$Hello=fgets(STDIN);

trim($Hello);//余計な改行を除去
$s = str_replace(array("\r\n","\r",PHP_EOL), '', $Hello);//OS間の改行の互換性を高める
     $sentence =explode(" ", $s);//文をスペース単位で分割した配列を生成h
 
    for ($i = 0; $i < $n; $i++) {
        echo ($sentence[$i].PHP_EOL);
        
    }
?>
//```