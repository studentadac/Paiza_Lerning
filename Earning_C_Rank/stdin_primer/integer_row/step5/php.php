//言語：php
//問題URL:https://paiza.jp/works/mondai/stdin_primer/stdin_primer__integer_row_boss
//コメント：
//コード：
//```php
<?php

while (($buffer = fgets(STDIN)) != false) //入力が取得できなくなるまで入力を繰り返す
{
    echo $buffer; //表示
}

?>
//```