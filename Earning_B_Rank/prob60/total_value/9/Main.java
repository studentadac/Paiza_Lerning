//言語：Java
//問題URL：https://paiza.jp/works/mondai/prob60/total_value_9
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     
     int sum=0;
     for (int i=0;i<n ;i++ )
     {
         int a=sc.nextInt(),b=sc.nextInt();
         
        sum+= a==b?a*b:a+b;
         
     }
     
     System.out.println(sum);
     
     
    }
}
//```