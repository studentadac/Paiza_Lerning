//言語：java
//問題URL：https://paiza.jp/works/mondai/array_primer/array_primer__string_i-thinput_step4
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt()-1,m=sc.nextInt(),l=sc.nextInt()-1;
        sc.nextLine();//mごと改行
        String[] line = sc.nextLine().split(" ");
        System.out.println(line[n].charAt(l));
    }
}
//```