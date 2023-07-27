//言語：JavaScript
//問題URL:https://paiza.jp/works/mondai/ppg_sl_js/ppg_sl_js__enjou
//コメント：
//コード：
//```js
const input = require('fs').readFileSync('/dev/stdin', 'utf8')
let due = parseInt(input, 10);
if(due<=3){
	console.log("BOMB");
	process.exit(0);
}
console.log("ONGOING");
//```