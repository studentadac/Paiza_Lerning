//言語：JavaScript
//問題 https://paiza.jp/works/mondai/stdin/stdin_3
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
  var line = lines[0].split(" ");
  for (var i = 0; i < line.length; i++) {
      console.log(line[i]);
  }
  
});
//```