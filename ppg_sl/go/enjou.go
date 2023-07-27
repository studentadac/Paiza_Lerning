//言語：Go
//問題URL:https://paiza.jp/works/mondai/ppg_sl_go/ppg_sl_go__enjou
//コメント：
//コード：
//```go
package main

import (
	"fmt"
	"os"
)

func main() {
	var due int
	fmt.Scan(&due)
	if due<=3 {
		fmt.Println("BOMB")
		os.Exit(0)
	}
	fmt.Println("ONGOING")
}
//```