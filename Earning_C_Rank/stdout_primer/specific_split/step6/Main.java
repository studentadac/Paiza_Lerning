//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_split_step6
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
       char[] c = line.toCharArray();

       final int ll=line.length();
       for (int i=0;i<ll ;i++ ) 
       {
           System.out.print(c[i]);
           
           if((i+1)%3==0&&i!=ll-1)
           {
               System.out.print(",");
           }
           
       }
       
       
    }
}
//```