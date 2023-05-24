//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/normal_step5
//コード：参考 https://www.techscore.com/blog/2012/11/28/%E6%95%B0%E5%80%A4-%E2%87%94-%E6%96%87%E5%AD%97%E5%88%97%E5%A4%89%E6%8F%9B-java%E7%B7%A8/
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int  x = sc.nextInt();
        int y= sc.nextInt()+x;
        int  n = sc.nextInt()-1;
        System.out.println(String.valueOf(y).charAt(n));
    }
}
//```