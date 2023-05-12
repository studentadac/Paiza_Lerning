//言語：php
//問題URL:
https://paiza.jp/works/mondai/stdin_primer/stdin_primer__real_number_step3
https://paiza.jp/works/mondai/stdin_primer/stdin_primer__real_number_boss
//コメント：
//コード：
//```php
<?php
 $Hello=fgets(STDIN);

trim($Hello);//余計な改行を除去
   $s = str_replace(array("\r\n","\r",PHP_EOL), '', $s);//OS間の改行の互換性を高める
     $sentence =explode(" ", $Hello);//文をスペース単位で分割した配列を生成
 $n=$sentence[0];
unset($sentence[0]);//nを削除


    for ($i = 0; $i < $n; $i++) {
        echo ($sentence[$i+1].PHP_EOL);
        
    }
?>
//```