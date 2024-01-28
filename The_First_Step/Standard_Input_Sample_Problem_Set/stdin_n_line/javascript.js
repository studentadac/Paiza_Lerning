//言語：JavaScript
//問題https://paiza.jp/works/mondai/stdin/stdin_n_line
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
    for (var i = 0; i < lines[0]; i++) {
        console.log(lines[i+1]);
    }
  
});
//```