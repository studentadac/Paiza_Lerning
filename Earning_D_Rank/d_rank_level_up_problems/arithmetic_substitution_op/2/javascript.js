//言語：JavaScript
//問題 https://paiza.jp/works/mondai/d_rank_level_up_problems/d_rank_level_up_problems__arithmetic_substitution_op_2
//コメント：
//コード：
//```js
/*
整数 A = 437,326、 B = 9,085 とします。以下の二つの演算の結果を半角スペース区切りで出力してください。

1. A を B で割った商
2. A を B で割った余り
*/
  const a=437326;
  const b=9085;
  const div=Math.floor(a / b);
  const mod=a%b;
  
  console.log(div+" "+mod);
//```