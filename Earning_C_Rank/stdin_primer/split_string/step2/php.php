//言語：php
//問題URL:https://paiza.jp/works/mondai/stdin_primer/stdin_primer__split_string_step2
//コメント：
//コード：
//```php
<?php
  
  $Hello="He likes paiza";
     $sentence =explode(" ", $Hello);//文をスペース単位で分割した配列を生成
     foreach ($sentence as $word) {
        echo($word.PHP_EOL);//配列の要素を出力した後に改行
     }
?>
//```