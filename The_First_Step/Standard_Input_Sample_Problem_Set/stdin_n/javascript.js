//言語：JavaScript
//問題 https://paiza.jp/works/mondai/stdin/stdin_n
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
  const n=parseInt(lines[0]);
  const line = lines[1].split(" ");
  for (var i = 0; i < n; i++) {
      console.log(line[i]);
  }
  
});
//```