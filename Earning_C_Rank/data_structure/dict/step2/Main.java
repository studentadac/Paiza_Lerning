//言語：java
//問題URL：https://paiza.jp/works/mondai/data_structure/data_structure__dict_step2
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        sc.close();
        int x[]=new int[26];

        for (int i=0;i<26 ;i++ )
        {
            x[i]=0;
        }
        
        for (int i=0;i<n ;i++ )
        {
            x[(int)(s.charAt(i)-'a')]++;

        }

        for (int i=0;i<26 ;i++ )
        {
            System.out.print(x[i]);
            if(i!=25)
                System.out.print(" ");
            else
                System.out.println("");
        }


    }
}
//```