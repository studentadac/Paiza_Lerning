//言語：Java
//問題URL：https://paiza.jp/works/mondai/skillcheck_sample/fizz-buzz
//コメント：
//コード：
//```Java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n ;i++ )
        {
            
            if(i%15==0)
            System.out.println("Fizz Buzz");
            else if(i%3==0)
            System.out.println("Fizz");
            else if(i%5==0)
            System.out.println("Buzz");
            else
            System.out.println(i);
            
        }
        
        
       
    }
}
//```