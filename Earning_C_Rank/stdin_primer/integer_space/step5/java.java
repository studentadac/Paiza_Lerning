//言語：java
//問題URL：https://paiza.jp/works/mondai/stdin_primer/stdin_primer__integer_space_boss

//コメント：
//コード：参考:https://qiita.com/jorrvaskr/items/088059b2bf913ed1975c
//```java
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        
        String[] words = line.split(" ");//文字列をスペース区切りで分割して配列に変換
        
        int[] intArray = Stream.of(words).mapToInt(Integer::parseInt).toArray();//String配列をint型配列に変換

        for (int num: intArray){
//拡張for文で要素を全て出力
      System.out.println(num);
    }
       
    }
}
//```