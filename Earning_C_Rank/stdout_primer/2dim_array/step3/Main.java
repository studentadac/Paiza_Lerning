//言語：java
//問題URL：https://paiza.jp/works/mondai/stdout_primer/stdout_primer__2dim_array_step3
//コメント：
//コード：
//```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
       final int n=9;
       
       for (int i=0;i<n ;i++ )
       {
           String[] s=new String[n];
           for(int j=0;j<n;j++)
           {
               s[j]=Integer.valueOf((i+1)*(j+1)).toString();
               
           }
           String ans=String.join(" ",s);
           System.out.println(ans);
           
           
       }
       
    }
}
//```