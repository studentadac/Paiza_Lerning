//言語：java
//問題URL：https://paiza.jp/works/mondai/loop_problems/loop_problems__fizzbuzz

//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        for (int i=1; i<=100;i++ ) 
        {
            if(i%3==0)//FizzBuzzが連結できることを利用する
            System.out.print("Fizz");
            if(i%5==0)
            System.out.print("Buzz");
            if(i%3!=0&&i%5!=0)//3でも5でも割り切れない場合
            System.out.print(i);
            
            System.out.println("");//改行だけ最後
        }
    
    }
}
/*1 ~ 100 の整数に対して、3 と 5 の両方で割り切れるなら FizzBuzz を、
3 でのみ割り切れるなら Fizz 、5 でのみ割り切れるなら Buzz を改行区切りで出力してください。
また、どちらでも割り切れない場合は、その数字を改行区切りで出力してください。*/
//```