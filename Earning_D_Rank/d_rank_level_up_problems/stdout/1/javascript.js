//言語：JavaScript
//問題 https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__stdout_1
//コメント：
//コード：
//```js
process.stdin.resume();
process.stdin.setEncoding('utf8');
// 自分の得意な言語で
// Let's チャレンジ！！
var lines = [];
var reader = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});
reader.on('line', (line) => {
  lines.push(line);
});
reader.on('close', () => {
  console.log("paiza");
});
//```