//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/advance_step10
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();
        
        for (int i=0;i<a.length ;i++ )
        {
            System.out.print((a[i]-'0')+(b[i]-'0'));
            
        }
        System.out.println("");

       
       
    }
}
//```