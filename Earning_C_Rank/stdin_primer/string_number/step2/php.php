//言語：php
//問題URL:https://paiza.jp/works/mondai/stdin_primer/stdin_primer__string_number_step2
//コメント：
//コード：
//```php
<?php
    $dummy=fgets(STDIN);//nは使わないが入力は受け取る
 $Hello=fgets(STDIN);

trim($Hello);//余計な改行を除去
   $s = str_replace(array("\r\n","\r",PHP_EOL), '', $s);//OS間の改行の互換性を高める
     $sentence =explode(" ", $Hello);//文をスペース単位で分割した配列を生成
 

     foreach ($sentence as $word) {
        echo($word.PHP_EOL);//配列の要素を出力した後に改行
     }
?>
//```