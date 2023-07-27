//言語：php
//問題URL:https://paiza.jp/works/mondai/ppg_sl_php/ppg_sl_php__enjou
//コメント：
//コード：
//```php
<?php
    $due = intval(fgets(STDIN));
    if ($due<=3) {
        echo "BOMB\n";
        exit(0);
    }
    echo "ONGOING\n";
?>
//```