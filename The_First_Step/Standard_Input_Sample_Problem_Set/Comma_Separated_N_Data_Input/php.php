//言語：php
//問題URL:https://paiza.jp/works/mondai/stdin/stdin_comma_n
//コメント：
//コード：
//```php

<?php
    // 自分の得意な言語で
    // Let's チャレンジ！！
    $input_line = fgets(STDIN);
    $input = fgets(STDIN);
    $pieces = explode(",", $input);
foreach ($pieces as $variable) {
    echo($variable);
    echo(PHP_EOL);
}
 
?>




//```