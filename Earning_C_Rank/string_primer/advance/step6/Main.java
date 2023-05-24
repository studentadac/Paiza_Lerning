//言語：java
//問題URL：https://paiza.jp/works/mondai/string_primer/advance_step6
//コード：
//```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int q = sc.nextInt();
        int []n=new int[q];
        String[]c= new String[q];
        
        for (int i=0;i<q ;i++ )
        {
            n[i]=sc.nextInt()-1;
            c[i]=sc.next();

        }
        String w=sc.next();

        StringBuilder sb = new StringBuilder(w.repeat(N));
        //      System.out.println(sb);
        for (int i=0;i<q ;i++ )
        {
            sb.replace(n[i],n[i]+1,c[i]);
        }
        System.out.println(sb);
    }
}
//```