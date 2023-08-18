//言語：java
//問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__split_input_boss
https://paiza.jp/works/mondai/stdin_primer/stdin_primer__split_input_step1~4
//コメント：
//コード：
//```java

import java.util.*;
public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        
        String[] words = line.split(" ");//文字列をスペース区切りで分割して配列に変換
        for (String word: words){
//拡張for文で要素を全て出力
      System.out.println(word);
    }
       
    }
}



//```