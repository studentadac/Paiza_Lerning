//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step4
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int h=sc.nextInt();
        final int w=sc.nextInt();
        final String a=sc.next();
        final String b=sc.next();

        String pair="("+a+", "+b+")";
        String s="";
        for (int j=0;j<w ;j++ )
        {

            s+=pair;
            if(!(j == (w - 1))) s += " | ";


        }
        //    System.out.println(s);
        for (int i=0;i<h ;i++ )
        {
            System.out.println(s);
            String repeatedString = "=".repeat(s.length());
            if(i != (h - 1)) System.out.println(repeatedString);
        }

    }
}
//```